package amazon.learn.week2;

import java.util.Scanner;

public class SocialMediaAdvice {

    double instaTime;
    double facebookTime;
    double youtubeTime;
    double tiktokTime;

    static void main() {

        SocialMediaAdvice adviceBasedOnSocialMediaTime = new SocialMediaAdvice();
        Scanner input = new Scanner(System.in);

        System.out.println("How many hours do you spend on Instagram per day?");
        adviceBasedOnSocialMediaTime.instaTime = input.nextDouble();

        System.out.println("How many hours do you spend on Facebook per day?");
        adviceBasedOnSocialMediaTime.facebookTime = input.nextDouble();

        System.out.println("How many hours do you spend on YouTube per day?");
        adviceBasedOnSocialMediaTime.youtubeTime = input.nextDouble();

        System.out.println("How many hours do you spend on TikTok per day?");
        adviceBasedOnSocialMediaTime.tiktokTime = input.nextDouble();

        double totalTime = adviceBasedOnSocialMediaTime.instaTime + adviceBasedOnSocialMediaTime.facebookTime + adviceBasedOnSocialMediaTime.youtubeTime + adviceBasedOnSocialMediaTime.tiktokTime;
        if(totalTime >= 5){
            System.out.println("You are spending too much time on social media. Consider reducing your time on these platforms.");
        }else{
            System.out.println("You are spending a reasonable amount of time on social media. Keep it up!");
        }
    }
}
