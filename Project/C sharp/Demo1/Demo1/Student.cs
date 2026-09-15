using System;
using System.Collections.Generic;
using System.Text;

namespace Demo1
{
    internal class Student:Person
    {
        private string _age;

        public string Age
        {
            get { return _age; }
            set { _age = value; }
        }

        public override void infomation()
        {
            string info = "Information:\n" +
                "\nId:" + Id +
                "\nName:" + Name +
                "\nGender:" + Gender +
                "\nAge:" + Age;
            Console.WriteLine(info);
        }
    }
}
