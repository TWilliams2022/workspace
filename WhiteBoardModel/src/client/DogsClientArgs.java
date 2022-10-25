package client;

class DogsClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java client.DogsClientArgs <age> <origin> <color>";
            String example = "Example: java client.DogsClientArgs 6 Charleston, SC brown";
            String note = "Note: supported whatKindOfDog are German_Shepard, Bulldog, Doberman, Pug";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;  // early return from main(), application exits
        }


        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");
    }
}