package com.example.weddingplanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.weddingplanner.adapter.PhotoDetailAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ArticleDetailActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @BindView(R.id.tvDescription)
    TextView tvDescription;

    @BindView(R.id.imgHeart)
    ImageView imgHeart;

    String screen;
    int id;
    ArrayList<Integer> listOfImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_detail);
        ButterKnife.bind(this);
        screen = getIntent().getStringExtra("screen");
        id = getIntent().getIntExtra("id",-1);
        if (screen.equalsIgnoreCase("real_wedding")){
            listOfImages = getRealWeddingImagesBasedOnId(id);
        } else {
            listOfImages = getArticleImagesBasedOnID(id);
        }
        setUpAdapter(listOfImages);
    }

    private ArrayList<Integer> getRealWeddingImagesBasedOnId(int id){
        ArrayList<Integer> list = new ArrayList<>();
        list.clear();
        switch (id){
            case 1:
                list.add(R.drawable.ic_rw_aman_niti_1);
                list.add(R.drawable.ic_rw_aman_niti_2);
                list.add(R.drawable.ic_rw_aman_niti_3);
                list.add(R.drawable.ic_rw_aman_niti_4);
                list.add(R.drawable.ic_rw_aman_niti_5);
                list.add(R.drawable.ic_rw_aman_niti_6);
                tvDescription.setText("Okay, we can't lie! We love an offbeat bridal lehenga as much as we love the traditional red. Parita's olive green lehenga with multi coloured embriodery had our heart the minute we saw it! It's such a perfect colour for a wintery, sea-side wedding and we think that is exactly why Parita opted for it. Excellent photography by Marshmallow Studio as it captured all the details vividly! Scroll down and see, and don't forget to pin her lehenga for major inspo! \n" +
                        "From The Bride: \n" +
                        "As our wedding is arrange marriage. we were very excited to begin our future together as we both liked each other after our 1st day of meeting , and still knowing each other day by day that's what makes our journey surprising and interesting and rest is the history.\n" +
                        "\n" +
                        "Decorator & Wedding Planner: The Wedding Soul\n" +
                        "Miss Vaishali Gohil & Mr. Ashok Jasani know exactly what their clients want and delivers it perfectly. They decor and planning was perfect. \n" +
                        "\n" +
                        "Makeup Artist:Hiya Makeup Studio\n" +
                        "If you are getting married in Mumbai, this is the salon you need to check out.\n" +
                        "\n" +
                        "Venue - AnnaSaheb Vartak Hall,Mumbai\n" +
                        "Excellent venue for the big fat Indian wedding. They can handle even a guest list of 5000 people! Hats off to them for what they do! \n" +
                        "\n" +
                        "Photography: Divyesh Harchekar Photography\n" +
                        "Mr Harchekar, the sole star behind the scenes! Big cheers to him. \n" +
                        "\n" +
                        "Vendors: \n" +
                        "Venue:  AnnaSaheb Vartak Hall, Mumbai ; \n" +
                        "Makeup Artist: Hiya Makeup Studio ; \n" +
                        "Photography: Divyesh Harchekar Photography;\n" +
                        "Decor & Planning: The Wedding Soul, Surat; ");
                break;

            case 2:
                list.add(R.drawable.ic_rw_ashritha_yashwant_1);
                list.add(R.drawable.ic_rw_ashritha_yashwant_2);
                list.add(R.drawable.ic_rw_ashritha_yashwant_3);
                list.add(R.drawable.ic_rw_ashritha_yashwant_4);
                tvDescription.setText("Add Description");
                break;


            case 3:
                list.add(R.drawable.ic_rw_palak_chirag_1);
                list.add(R.drawable.ic_rw_palak_chirag_2);
                list.add(R.drawable.ic_rw_palak_chirag_3);
                list.add(R.drawable.ic_rw_palak_chirag_4);
                list.add(R.drawable.ic_rw_palak_chirag_5);
                list.add(R.drawable.ic_rw_palak_chirag_6);
                tvDescription.setText("Add Description");
                break;


            case 4:
                list.add(R.drawable.ic_rw_prachi_mohit_1);
                list.add(R.drawable.ic_rw_prachi_mohit_2);
                list.add(R.drawable.ic_rw_prachi_mohit_3);
                list.add(R.drawable.ic_rw_prachi_mohit_4);
                list.add(R.drawable.ic_rw_prachi_mohit_5);
                list.add(R.drawable.ic_rw_prachi_mohit_6);
                list.add(R.drawable.ic_rw_prachi_mohit_7);
                tvDescription.setText("Add Description");
                break;


            case 5:
                list.add(R.drawable.ic_rw_shailesh_divya_1);
                list.add(R.drawable.ic_rw_shailesh_divya_2);
                list.add(R.drawable.ic_rw_shailesh_divya_3);
                list.add(R.drawable.ic_rw_shailesh_divya_4);
                list.add(R.drawable.ic_rw_shailesh_divya_5);
                list.add(R.drawable.ic_rw_shailesh_divya_6);
                tvDescription.setText("Add Description");
                break;


            case 6:
                list.add(R.drawable.ic_rw_shekhar_madhuri_1);
                list.add(R.drawable.ic_rw_shekhar_madhuri_2);
                list.add(R.drawable.ic_rw_shekhar_madhuri_3);
                list.add(R.drawable.ic_rw_shekhar_madhuri_4);
                list.add(R.drawable.ic_rw_shekhar_madhuri_5);
                list.add(R.drawable.ic_rw_shekhar_madhuri_6);
                list.add(R.drawable.ic_rw_shekhar_madhuri_7);
                list.add(R.drawable.ic_rw_shekhar_madhuri_8);
                list.add(R.drawable.ic_rw_shekhar_madhuri_9);
                tvDescription.setText("Add Description");
                break;

            case 7:
                list.add(R.drawable.ic_rw_shivali_abhjeet_1);
                list.add(R.drawable.ic_rw_shivali_abhjeet_2);
                list.add(R.drawable.ic_rw_shivali_abhjeet_3);
                list.add(R.drawable.ic_rw_shivali_abhjeet_4);
                list.add(R.drawable.ic_rw_shivali_abhjeet_5);
                tvDescription.setText("Add Description");
                break;

            case 8:
                list.add(R.drawable.ic_rw_sonal_akash_1);
                list.add(R.drawable.ic_rw_sonal_akash_2);
                list.add(R.drawable.ic_rw_sonal_akash_3);
                list.add(R.drawable.ic_rw_sonal_akash_4);
                list.add(R.drawable.ic_rw_sonal_akash_5);
                list.add(R.drawable.ic_rw_sonal_akash_6);
                list.add(R.drawable.ic_rw_sonal_akash_7);
                list.add(R.drawable.ic_rw_sonal_akash_8);
                tvDescription.setText("Add Description");
                break;

            case 9:
                list.add(R.drawable.ic_rw_sumaan_ishaan_1);
                list.add(R.drawable.ic_rw_sumaan_ishaan_2);
                list.add(R.drawable.ic_rw_sumaan_ishaan_3);
                list.add(R.drawable.ic_rw_sumaan_ishaan_4);
                list.add(R.drawable.ic_rw_sumaan_ishaan_5);
                list.add(R.drawable.ic_rw_sumaan_ishaan_6);
                tvDescription.setText("Add Description");
                break;

            case 10:
                list.add(R.drawable.ic_rw_swati_kamlesh_1);
                list.add(R.drawable.ic_rw_swati_kamlesh_2);
                list.add(R.drawable.ic_rw_swati_kamlesh_3);
                list.add(R.drawable.ic_rw_swati_kamlesh_4);
                list.add(R.drawable.ic_rw_swati_kamlesh_5);
                list.add(R.drawable.ic_rw_swati_kamlesh_6);
                list.add(R.drawable.ic_rw_swati_kamlesh_7);
                list.add(R.drawable.ic_rw_swati_kamlesh_8);
                tvDescription.setText("Add Description");
                break;
        }
        return list;
    }
    private ArrayList<Integer> getArticleImagesBasedOnID(int id){
        ArrayList<Integer> list = new ArrayList<>();
        list.clear();
        switch (id){
            case 1:
                list.add(R.drawable.ic_article_1);
                tvDescription.setText("In the era of deep V necks and sweetheart necklines would you rather go for a boat neck blouse style with your bridal wear? Well, if your personal style screams comfy, grace and old-world charm then you'd obviously opt for boat neck blouse pattern, and nail it with any outfit! Be it a lehenga skirt or a saree boat neck blouse never disappoints when paired with either of these. And if you think it doesn't have the power to make heads turn, then you've got to check the ones we've curated below! You know that our real brides never fail to impress us with their elegant choices, so it's time for you to deep dive already.\n" +
                        "\n" +
                        "Psstt.. don't forget to save the boat neck blouse patterns that you loved the most.");
                break;

            case 2:
                list.add(R.drawable.ic_article_2);
                tvDescription.setText("Thinking about wedding decor may seem like a distant dream to a lot of you right now, and it's totally okay to feel like that! It's a phase wherein you'll experience a roller coaster of emotions and no matter how much everyone says \"you're overthinking\", don't let it overpower your thought process until you want it. But one thing that we'd like to promise is, that we are not stopping with helping you plan your magical wedding. Yes, it's still happening, just a little later!");
                break;


            case 3:
                list.add(R.drawable.ic_article_3);
                tvDescription.setText("Wedding invites are the one thing in your wedding planning checklist that you can tick off even while you are quarantined at home! Most wedding designers do designs online and this would be a great time to sit with them, discuss what you like and finalize on the designs via email. So if you are planning to tie the knot in late 2020 or even next year and are looking to finalize your wedding card, check out trending colour palettes and designs suggested by amazing wedding invitation designers that would rock your wedding invitations!\n");

                break;


            case 4:
                list.add(R.drawable.ic_article_4);
                tvDescription.setText("As if the wedding planning stress wasn't enough, now it has increased a 100 times more during these trying times. Brides who had their weddings in March and April got a rude surprise, but after that, we've seen weddings happen, but within the government guidelines which allow gatherings of 50 people to happen, and the situation is expected to continue so till at least September 2020. So while you can have a wedding, your original plans might have to be changed- even in some cases, completely.\n" +
                        "\n" +
                        "Take a deep breath girl, and while we understand it is natural to feel overwhelmed right now, you need to take things into your hands and make a few decisions- which also include speaking to your vendors and asking them a few questions. These are applicable for brides who have their wedding dates during the lockdown, for those who have postponed or cancelled for now, or even brides who have their wedding upcoming later this year. \n");
                break;


            case 5:
                list.add(R.drawable.ic_article_5);
                tvDescription.setText("With the headlines reading ‘Another positive Coronavirus case found’ every other hour, an enmasse panic has tremendously hit the nation. People are not willing to move out of their houses. The tourism industry has come to a standstill. And just when we were reading thousand other implications of this deadly coronavirus outbreak, we wondered how it would have affected those who had planned their destination weddings in the recent time. \n" +
                        "\n" +
                        "So we got in touch with some of the most renowned destination wedding planners to take their first-hand inputs & know how coronavirus is affecting the wedding industry. Scroll down to read out their comments, and plan your ‘I do’ wisely.");
                break;


            case 6:
                list.add(R.drawable.ic_article_6);
                tvDescription.setText("If you have a summer wedding coming up, you're probably in some or the other stage of your wedding planning right now- if its not deciding the venue, then maybe you're checking out WMG or Pinterest or Instagram to hone down the finer details- like the theme or the decor. So how about we help you a little by telling you the trending colour schemes which you can consider for your mehendi or wedding?\n" +
                        "\n" +
                        "Unconventionally Bohemian"+"\n" +
                        "Lavenders & Hydrangeas"+"\n"+
                        "Gulmohar Bagh"+"\n" +
                        "Botanical with Pastel"+"\n" +
                        "Tropical With A Twist");
                break;

            case 7:
                list.add(R.drawable.ic_article_7);
                tvDescription.setText("We love a couple who try and do things differently, and want to make the wedding a fun experience for their guests. Sakshi and Achal did that at their engagement, with a fun game we had never heard of before, and their wedding was not only gorgeous, but had some amazing ideas and thoughtful favours for their guests. So here's a lowdown on the ideas implemented by Vivaha Wedding Solutions , who planned the games and sourced the favours- ideas that we absolutely loved! And the photos by Aksha Shah Mehendi Designer to do full justice to everything!");
                break;

            case 8:
                list.add(R.drawable.ic_article_8);
                tvDescription.setText("Getting an auspicious marriage date is half work done! When looking for a marriage date, there are a lot of aspects that need to be considered like the month, season and holidays. It needs to be the perfect date that is comfortable for both families. 2020 commenced with a rough start, but we are hopeful, that this too shall pass.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "April, May are popular months for the weddings in India. We know that the Covid19 outbreak and the lockdown has forced many of you couple to cancel the weddings. It might have been dishearting, but nevertheless, when the things settle, all you beautiful couple can plan your perfect wedding. To help you in your planning, we have jotted a list of auspicious Telugu Wedding dates. These 2020 wedding dates are according to the Telugu Calendar!\n" +
                        "\n" +
                        "Telugu Wedding Dates for June\n" +
                        "\n" +
                        "Date \tDay\n" +
                        "09-Jun-20 \tTuesday\n" +
                        "14-Jun-20 \tSunday\n" +
                        "15-Jun-20 \tMonday\n" +
                        "26-Jun-20 \tFriday");
                break;

            case 9:
                list.add(R.drawable.ic_article_9);
                tvDescription.setText("Indian weddings have so much of culture and tradition. When now weddings are becoming more global there are certain traditions that still hold a special place in our heart. Especially those that involve blessing the bride and groom for #foreverhappiness. You would surely know that there is a rush of flowers thrown on the bride and groom during the ceremony blessing them. In Telugu weddings there is another exclusive blessing and more fun ritual that is called Talambralu. ");
                break;

            case 10:
                list.add(R.drawable.ic_article_10);
                tvDescription.setText("Themes are super in these days, be it for the decor, the outfits, or just for the general vibe of the wedding event. So this couple had a theme for every function at their grand Jaipur wedding, and there were some neat ideas they implemented! Akansha and Ankit had a lavish wedding in Jaipur, and they had loads of interesting ideas in store, as detailed by the bride herself! The photos by DJ Cassino captured all the fun!");
                break;

            case 11:
                list.add(R.drawable.ic_article_11);
                tvDescription.setText("We've read some really interesting 'how we met' stories, but this one, is by far, the most adorable, amazing and unbelievable of 'em all! It's like you cross paths, feel a connection only to meet again, and this time, it's for good. Woah, no less than a romantic novel! And when you thought it's just the story that kept us hooked, well you've got to lay eyes on Grishma's Kanjeevaram sarees (both wedding and muhuratam) in ethereal shades of Purple. Sheer gorgeousness!\n" +
                        "\n" +
                        "This elegant Karnataka wedding oozed love, laughter, and buoyancy and was perfectly captured by National Decorations Productions. Dive in to know how this couple crafted their magical wedding memories.\n" +
                        "\n");
                break;

            case 12:
                list.add(R.drawable.ic_article_12);
                tvDescription.setText("Being the backbone of the bride is no easy feat! From following-up with the vendors to handling the bridechilla while looking your stylish best, there are truckloads of duties that a bridesmaid has to perform. And amidst all this hustle-bustle, pinning a beautiful mehndi design is probably one of the last things that comes to your mind! Hence, we decided to turn your ultimate saviours, and compile some of the prettiest ones for the back of your hands!\n" +
                        "\n" +
                        "You'll be constantly photographed by the shutterbugs throughout the wedding shenanigans, and you sure wouldn't want to miss flaunting those mehndi-stained hands. So be smart and pick one of these gorgeous back-hand mehndi designs for yourself! \n" +
                        "\n");
                break;

            case 13:
                list.add(R.drawable.ic_article_13);
                tvDescription.setText("So post the lockdown or Coronavirus wedding cancelation, you've decided to go small, not big. Have an intimate wedding with your near and dear ones instead of going all out. So the question now is, what do you wear to an intimate wedding? First up, let us tell you there are no rules here. You can do whatever you please, but if you're looking for some ideas, we have some suggestions right here for you.");
                break;

            case 14:
                list.add(R.drawable.ic_article_14);
                tvDescription.setText("The wedding cake is the most \"picture-friendly\" idea at your wedding. Let's just admit that. The reception / party these days always features a good cake - and while it tastes yummmmm, it needs to look amazing to set the tone of your wedding pictures right. Right? Of course, your baker is the best person to make it pretty and add ideas and attachments to it, but does that mean you take a backseat completely? No siree, it pays to know what's in the market and what works. We already gave you the essential cake-loving advice. Now it's time to put together a few ideas that might just make your wedding cake picture an instagram-worthy one from our own weddings and vendors! (wink, wink)");
                break;

            case 15:
                list.add(R.drawable.ic_article_15);
                tvDescription.setText("Every once in a while, we come across weddings which really make us believe in love. One such wedding is that of Ayesha Nageshwaran and Katja Hahnloser-Nageshwaran, a wedding which brought together Indian and Western traditions, and happened across Zurich, Delhi & Jaisalmer. While Ayesha is a New Delhi-based entrepreneur, her Swiss partner, Katja Hahnloser-Nageshwaran, owns a multi-brand fashion boutique in Zürich. Their wedding was photographed beautifully by Divyesh Harchekar Photography★ 5 , who did full justice to it!");
                break;

            case 16:
                list.add(R.drawable.ic_article_16);
                tvDescription.setText("Groom trends come and go, and most of the time they are so subtle that they are easily missed or not noticed. After bright contrasting safas and floral safas, looks like grooms are going back to basics now, with a little tweak- pulling off all monotone looks for their wedding day. Yup- matching head to toe right from the safa to the sherwani and the pyjama and sometimes the shoes too. So here are some of the looks we loved, in different coloured sherwanis!");
                break;

            case 17:
                list.add(R.drawable.ic_article_17);
                tvDescription.setText("Ritu & Ankit got married in a grand celebration in Kolkata. Everything, from the decor to the outfits, was vivid yet unique. Ritu opted for an offbeat hue for almost all her functions, but it was her wedding outfit which was completely different. She chose a pastel shade for a night wedding and rocked it effortlessly. Fantasy Filmer captured this extravagant affair in all it's stunning details and shot some adorably candid moments between the couple. Scroll down and check out all the details! ");
                break;

            case 18:
                list.add(R.drawable.ic_article_18);
                tvDescription.setText("We love a stylish bridesmaid, and our 'Sister of the bride' series is just that- showing you a bridesmaid who got it just right at the wedding! Be it the outfit, the jewellery, the styling, or bringing the whole look together, here is a sister of the bride who's style we really liked, so, over to Simran now, as she takes us through every outfit she wore for the #ohhmyGauSh wedding.");
                break;

            case 19:
                list.add(R.drawable.ic_article_19);
                tvDescription.setText("Taking your vows under a blooming mandap with a bunch of drapes suspended here and there, is a concept that our couples are following for ages now, and it shall go on forever! But like they say, a little bit of change (especially one that’s refreshing), does no harm to anyone!\n" +
                        "\n" +
                        "While it'll be unfair to say that classic mandap decorations are done to death, couples surely have found one of the most amazing mandap substitutes--Trees. From giant-sized to the ones with lush greenery, trees can alone give a refreshing makeover to your nuptials. That's the charm of nature! And when you add to that your favorite blooms, some chandeliers and other rustic touches, it'll make your guests go head over heels! Check out these prettiest tree decor setups we bookmarked for you, and incorporate their freshness to your big day.");
                break;
            case 20:
                list.add(R.drawable.ic_article_20);
                tvDescription.setText("The last few weeks we have had a huge upheaval in our cleanliness routines. Constant washing of hands and sanitizing them has become the new normal. But did you know that excessive use of hand sanitizer is bad for your engagement ring? Jewellery experts at Manali Jewellery, an online diamond retailer tell you on how to protect engagement rings from the excessive use of sanitizer!\n" +
                        "The experts revealed that excessive exposure to hand sanitizer and cleaning agents can make finish on white gold wear a little bit faster, but it won’t cause immediate damage. However, contact with cleaning agents such as chlorine, bleach, rubbing alcohol, antibacterial soaps and hand sanitizers can break down the brilliance of metals and gems over time. In other words, your rock might lose its shine—and probably won't come back. And not only do you run the risk of dulling the lustre of your ring, but you can also destroy the setting, too. Extensive hand sanitizer use can also loosen prongs that hold diamonds in place.\n" +
                        "\n" +
                        "So How Do You Protect Rings From Sanitizer?\n" +
                        "Do NOT stop using sanitizer or washing your hands with soap and water. Even if there are negative effects of hand sanitizer on your engagement ring, maintaining hygiene is crucial than any piece of jewellery. But since this piece of jewellery is dear to you, here are quick ways to protect rings from sanitizer\n");
                break;

            case 21:
                list.add(R.drawable.ic_article_21);
                tvDescription.setText("We know that the current situation has gotten all you brides and grooms planning your wedding in a total tizzy. So for all those reading this we have got you covered. Even though there are still good dates in 2020, we understand if you want to completely skip it and move on straight to 2021! Wedmegood sends out a whole lot of good vibes and along with it the list of Shubha Muhurtham dates for 2021 if you feel you need a good six months at least to plan your wedding. Check it out right away and start planning accordingly!!Shubha Muhurtham Dates For January 2021\n" +
                        "17th January 2021                                                              Sunday\n" +
                        "\n" +
                        "18th January 2021                                                              Monday\n" +
                        "\n" +
                        "25th January 2021                                                              Monday\n" +
                        "\n" +
                        "27th January 2021                                                              Wednesday\n" +
                        "\n" +
                        "The tamil month of Thai starts the wedding season. Soon after Pongal festivities gear up for the four Muhurtham days.\n" +
                        "\n" +
                        "Shubha Muhurtham Dates For February 2021\n" +
                        "1st February 2021                                                              Monday\n" +
                        "\n" +
                        "3rd February 2021                                                             Wednesday\n" +
                        "\n" +
                        "4th February 2021                                                             Thursday\n" +
                        "\n" +
                        "8th February 2021                                                             Monday\n" +
                        "\n" +
                        "15th February 2021                                                           Monday\n" +
                        "\n" +
                        "22nd February 2021                                                          Monday\n" +
                        "\n" +
                        "24th February 2021                                                           Wednesday\n" +
                        "\n" +
                        "25th February 2021                                                           Thursday");
                break;

        }
        return list;

    }

    private void setUpAdapter(ArrayList<Integer> listOfImages){
        PhotoDetailAdapter detailAdapter = new PhotoDetailAdapter(listOfImages);
        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
        pagerSnapHelper.attachToRecyclerView(recyclerView);
        recyclerView.setAdapter(detailAdapter);

    }

    @OnClick(R.id.imgHeart)
    void onHeartImageClicked(){
        if (imgHeart.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.ic_shortlist_heart).getConstantState()){
            imgHeart.setImageResource(R.drawable.ic_icon_ashortlist);
        } else {
            imgHeart.setImageResource(R.drawable.ic_shortlist_heart);
        }
    }

}