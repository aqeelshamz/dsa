using System;

string[] names = new string[4];

Console.WriteLine("Enter 4 names: ");

for(int i = 0; i < names.Length; i++){
    names[i] = Console.ReadLine();
}

Array.Sort(names);

Console.WriteLine("Sorted names: ");

for(int i = 0; i < names.Length; i++){
    Console.WriteLine(names[i]);
}

Console.ReadLine();