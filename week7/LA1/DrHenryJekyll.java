package week7.LA1;


public class DrHenryJekyll extends Personality implements Jekyll, Hyde {

   public boolean personalityJekyll = true;

    @Override
    void displayBehaviour() {
        if (personalityJekyll) {
            beKind();
        }
        else {
            beMenacing();
        }
    }

    @Override
    void transform() {
        personalityJekyll = !personalityJekyll;
    }

    @Override
    public void beKind() {
        System.out.println("Dr. Jekyll is kind, thoughtful, and respected.");
    }

    @Override
    public void beMenacing() {
        System.out.println("Mr. Hyde is menacing, wild, and dangerous.");
    }

    public static void main(String[] args) {
        DrHenryJekyll jekyllAndHyde = new DrHenryJekyll();

        jekyllAndHyde.displayBehaviour();

        System.out.println("Transforming into Mr. Hyde...");
        jekyllAndHyde.transform();
        jekyllAndHyde.displayBehaviour();

        System.out.println("Transforming back into Dr. Jekyll...");
        jekyllAndHyde.transform();
        jekyllAndHyde.displayBehaviour();
    }
}
