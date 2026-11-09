using System;


namespace PokeJJCM
{
    class Program
    {
        static void Main(string[] args)
        {
            Pokemon pok1 = new Pokemon("Pikachu", 50, 10);
            Pokemon pok2 = new Pokemon("Magikarp", 30, 20);

            while (pok1.Estado() && pok2.Estado())
            {
                pok1.RecibirDanio(pok2.Poder());
                if (pok1.Estado())
                {
                    pok2.RecibirDanio(pok1.Poder());
                }
            }
            Console.WriteLine("" + (pok1.Estado() ? pok1.Nombre() : pok2.Nombre()) + " ha ganado!");
        }

    }
}