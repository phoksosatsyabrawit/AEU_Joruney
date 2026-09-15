using System;
using System.Collections.Generic;
using System.Text;

namespace Demo1
{
    internal class Person
    {
        private string id;
        private string name;
        private string gender;

        public string Id
        {
            get { return this.id; }
            set { this.id = value; }
        }

        public string Name
        {
            get { return name; }
            set { this.name = value; }
        }

        public string Gender
        {
            get { return gender; }
            set { this.gender = value; }
        }

        public virtual void infomation()
        {
            string info = "Information:\n" +
                "\nId:" + Id +
                "\nName:" + Name +
                "\nGender:" + Gender;
            Console.WriteLine(info);
        }
    }
}
