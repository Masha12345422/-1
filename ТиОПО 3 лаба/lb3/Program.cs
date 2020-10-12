using System;
using System.IO;

namespace lb3
{
    class Program
    {
        static void Main(string[] args)
        {
            TextWriter save_out = Console.Out;
            TextReader save_in = Console.In;
            var new_out = new StreamWriter(@"output.txt");
            var new_in = new StreamReader(@"input.txt");
            Console.SetOut(new_out);
            Console.SetIn(new_in);

            double Z = 0, X, Y, iter;
            X = Convert.ToDouble(Console.ReadLine());
            Y = Convert.ToDouble(Console.ReadLine());
            iter = Convert.ToDouble(Console.ReadLine());
            int pow = 1, num = 6, num2 = 4;

            for (int i = 0; i < iter; i++)
            {
                if (i == 0)
                {
                    Z = 1 - X / 2;
                    continue;
                }

                if (i % 2 != 0)
                {
                    Z += (Math.Pow(Y, pow)) / num * num2;
                    pow++;
                    num = num * num2;
                    num2++;
                }

                if (i % 2 == 0)
                {
                    Z -= (Math.Pow(X, pow)) / num * num2;
                    pow++;
                    num = num * num2;
                    num2++;
                }

            }

            Console.WriteLine(String.Format("{0:0.0000000}", Z));

            Console.SetOut(save_out); new_out.Close();
            Console.SetIn(save_in); new_in.Close();

        }

    }
}
