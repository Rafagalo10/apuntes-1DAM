using System;

namespace PokeJJCM
{
    public class Pokemon
    {
        private string nombre;
        private int vidaMax, vida, poder;
        private bool vivo;

        public Pokemon(string nombre, int vidaMax, int poder)
        {
            this.nombre = nombre;
            this.vidaMax = vidaMax;
            this.poder = poder;
            vida = vidaMax;
            vivo = true; // Corregido para que empiece con vida
        }

        public bool Estado()
        {
            return vivo;
        }

        public int Poder()
        {
            return poder;
        }

        public string Nombre()
        {
            return nombre;
        }

        public void RecibirDanio(int cantidad)
        {
            vida -= cantidad;

            if (vida <= 0)
            {
                Console.WriteLine("¡" + nombre + " se ha debilitado!");
                vivo = false;
            }
            else
            {
                Console.WriteLine(nombre + " tiene " + vida + " PS restantes");
            }
        }
    }
}