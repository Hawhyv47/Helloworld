/**
 * 
 */
package stem4kids;
import java.util.Scanner;
/**
 * @author Shaun
 *
 */
public class Ifstatements {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("  O    O");
		System.out.println(" |______|");
	
		System.out.println("DO NOT TYPE IN YES OR NO THE ANIMAL FINDER ONLY ACCEPTS TRUE OR FALSE");
		System.out.println("==================================================================== ");
		System.out.println(" ");
		System.out.println("Does the thing you found have scales or scutes?");
		boolean scales = sc.nextBoolean();
		if (scales == true) {
			System.out.println("are there fins?");
			boolean fins = sc.nextBoolean();
			if (fins == true) {
				System.out.println("Your animal is a fishyfish");
		}
			System.out.println("Are there feathers?");
			boolean fethers = sc.nextBoolean();
			if ( fethers == true) {
				System.out.println("You have found a derived archosauriform reptile of the class Aves, a subdivision of the Theropod group of dinosaurs");
			}
			if (fethers == false) {
				System.out.println("Yoyu have found a reptile.");
			}
		}
			if (scales == false) {
				System.out.println("Is it furry?");
				boolean furry = sc.nextBoolean();
				if (furry == true) {
					System.out.println("You found a mammal");
				}
				if (furry == false) {
					System.err.print("You have found an invertebrate. This program only deals with vertebrates. go away.");
					System.out.println("Actually you know what, leyt's try to find out what kind of invertebrate this is.");
					System.out.println("Is it squishy?");
					boolean squishy = sc.nextBoolean();
					if (squishy == true){ 
						System.out.println("Is it worm-like?");
						boolean squirmywormy = sc.nextBoolean();
						if (squirmywormy == true){
							System.out.println("Is it flat?");{
								boolean flat = sc.nextBoolean();
								if (flat == true) {System.out.println("You have found a member of the phylum platyhelminthes!");
							}
								if (flat == false) {System.out.println("You have found an annelid worm");}
						}//this is for squirmywormy true
						}//this is for squishy is true
						if (squirmywormy== false) {System.out.println("Honestly, I think you should be able to tell if it's an echinoderm or a mollusc, okay?");}
				}
					if (squishy == false) {System.out.println("It's probably an arthropod");}
			}
			}
	sc.close();	}

	}
	



