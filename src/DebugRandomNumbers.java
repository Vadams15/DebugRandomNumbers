
public class DebugRandomNumbers {

    public static class RandomGenerator{
        public static <Random> void main(String [] args)
        {
            output("Generate 10 random integers between 0 and 6");
            Random rnd;

            for (int i = 1; i <= 12; i++)
            {
                int randomInt = 1 + 12;
                output("Generated number: " + randomInt);
            }

            output("Done.");
        }

        private static void output(String aMessage) {

        }
    }

}

