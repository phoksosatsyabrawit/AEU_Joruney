using System;
using System.Collections.Generic;
using System.Reflection;
using System.Text;
using System.Xml.Linq;

namespace Demo1
{
    internal class Teacher
    {
        private string _id;
        private string _name;
        private string _subject;

        public Teacher(string id, string name, string subject)
        {
            this._id = id;
            this._name = name;
            this._subject = subject;
        }

        public string Id
        {
            get { return _id; }
            set { _id = value; }
        }
        public string Name
        {
            get { return _name; }
            set { _name = value; }
        }

        public string Subject
        {
            get { return _subject; }
            set { _subject = value; }
        }

        public void info()
        {
            string str;
            str = "Teacher Information: \n" +
                "\nId: " + Id +
                "\nName: " + Name +
                "\nSubject: " + Subject;
            Console.WriteLine(str);
        }
        
    }
}
