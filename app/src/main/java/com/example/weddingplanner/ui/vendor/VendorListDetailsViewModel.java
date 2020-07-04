package com.example.weddingplanner.ui.vendor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.weddingplanner.R;
import com.example.weddingplanner.pojo.VendorItem;
import com.example.weddingplanner.pojo.VendorListDetailItem;

import java.util.ArrayList;

public class VendorListDetailsViewModel extends ViewModel {

    private MutableLiveData<ArrayList<VendorListDetailItem>> list;
    private ArrayList<VendorListDetailItem> listDetailItems;

    public VendorListDetailsViewModel(){
        list = new MutableLiveData<>();
        listDetailItems = new ArrayList<>();
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingCakesData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cakes_one,"Celejor","4","4.3","Santacruz West, Mumbai - 400054","1500","Celejor is a Mumbai-based bakery that offers a wide range of delicious baked products for weddings, festivities and special occasions. If you are looking for cakes for the pre-wedding celebrations, such as the engagement, haldi, or mehndi ceremonies, or the wedding, they offer custom cakes and cupcakes in a variety of designs using attractive toppings that you can choose from.\n" +
                "\n" +
                "Products offered\n" +
                "\n" +
                "They create multi-layered and fondant cakes in a variety of flavours such as butterscotch, vanilla and chocolate that you can select according to your taste, theme and personal requirements. Apart from cakes, they also offer cupcakes, muffins and mousses in order for you to have a beautiful, personalised dessert table on your special occasion.\n" +
                "\n" +
                "Other services\n" +
                "\n" +
                "In addition to cakes for weddings, Celejor provides delicious products for birthday parties, anniversaries, baby showers and Valentine's Day. They offer flavoured mousse and pastries that you can choose for your guests for various parties and small gatherings."));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cakes_two,"Chocolate Smith","2","3.6","Bandra West, Mumbai, Maharashtra 400050","2000","Chocolate Smith is a gift company located in Bandra. Indian wedding ceremonies are one of the most auspicious and amazing ceremonies of a person's life and it becomes imperative to select a proper and elegant gift for your guest which can be assigned with ease. If you are planning one such ceremony and looking for a good and inventive gift shop then Chocolate Smith is the choice you should make. This company has a wide range of delicious and sugary chocolates which will make your ceremonies a memorable and an enticing one.\n" +
                "\n" +
                "Products Offered\n" +
                "\n" +
                "Chocolate Smith has been proving ample of services from a really long time and agrees on the significance of your special day and leaves no stone unturned in making the chocolates with pure and surgery ingredients. Having a customised idea for your gift is not a problem anymore a the team is ready to provide a personalisation service where you can sleet your own taste and they will make sure to present it in the same way you have wished for.\n" +
                "\n" +
                "Chocolate Smith provides a plethora of services and products which are easy to access and can be availed with ease and pleasure and the team works hard in providing you with authorised packages. Depending upon the quantity of the order, they provide budget-friendly packages which can be selected as per your needs and demands. What are you waiting for? Opt for this company and make your ceremonies a lifetime remembrance."));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cakes_three,"Dcakes creation","3","4.4","M.I.D.C, Andheri East, Mumbai, Maharashtra 400093","1000","In order to celebrate your happiness you ought to have a little sugar and what better than a 4-tier cake elegantly decorated for you? If you're a cake lover and want to celebrate your big day sharing some unreally delicious cake with your loved ones, D Cake Creations is the ideal place for you. Its creations aren't only aesthetically pleasing but also do they have an exceptional flavour to please your taste buds.\n" +
                "\n" +
                "Products offered\n" +
                "\n" +
                "Baked with high quality ingredients, and an extraordinary attention to detail, creative decor and creative ideas, they present to you the most beautiful and exquisite cakes you would've ever tried. From one to six tires, they have mastered in making cakes for every taste and of all sizes.\n" +
                "\n" +
                "Apart from making beautiful cakes they also offer cupcakes for every occasion. Among the huge variety of flavours, fillings and frostings, stand out the following:\n" +
                "\n" +
                "->Chocolate\n" +
                "->Dark Ganache\n" +
                "->Red Velvet\n" +
                "->Vanilla Buttercream\n" +
                "->White Chocolate Ganache"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cakes_four,"Dutch Palace","4","4.2","Near Inox Theater, opposite Residency Club, Mumbai Maharashtra 411001","800","Dutch Palace is a bakery based in the city of Mumbai. Its a venture started in 2015 with the aim of offering delightful treats and friendly confectionaries to every client for their nuptial function and all its related events ranging from pre-wedding to post-wedding. Add a pinch of sweetness to your delightful wedding ceremony by opting this confectionery. They provide a wide range of cakes and other sweet treats which can be picked as per the requirements and wishes. Spring Street Bakery is the choice that you should be making for all your wedding ceremonies.\n" +
                "\n" +
                "Services Offered\n" +
                "\n" +
                "Dutch Palace has a team of bakers who have a lot of experience in this field and they strove hard in making you look fantastic. If you have a particular cake idea in your mind and want it to get customised as per your needs then that's also desirable. Make beautiful memories with your partner by choosing them for all your functions. You can get lovely options for eggless cakes for a smooth experience.\n" +
                "Dutch Palace offers an array of services like custom designing, tasting, cake toppers etc. Some of the products offered include the following:\n" +
                "\n" +
                "->Cupcakes\n" +
                "->Cookies\n" +
                "->Brownies\n" +
                "->Macarons\n" +
                "->Cake pops"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cakes_five,"Ferns N Petals","2","4.2","Sector 21, Kharghar, Navi Mumbai, Maharashtra 410210","1200","FNP Cakes 'n' More, a part of Ferns N Petals, aims to make every occasion a little more sweet and delicious by providing customised cakes. FNP boasts a huge network in all the major cities and have a large number of satisfied customers. FNP Cakes 'n' More features a variety of choices to make your wedding cake, more special and personal.\n" +
                "\n" +
                "Products offered\n" +
                "\n" +
                "FNP Cakes 'n' More offers a wide selection of flavours, sizes, themes and designs. Turn your imagination into a stunning and delicious delight by ordering a bespoke wedding cake. All the products offered by FNP Cakes 'n' More are made with premium quality ingredients and it will be delivered on time at the destination of your choice.\n" +
                "\n" +
                "Other services\n" +
                "\n" +
                "The delicious cakes and gifts of FNP Cakes 'n' More are suitable to add more sweetness and flavour for other events, such as:\n" +
                "\n" +
                "->Birthdays\n" +
                "->Anniversaries\n" +
                "->Engagements\n" +
                "->Special days"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cakes_six,"Luscious Bakers","1","4.2","Jambali Naka 400601 Thane East (Mumbai)","1400","Luscious Bakers is a Mumbai based bakery that can offer you an extensive range of delectable cakes and baked goodies to make your special occasions much more memorable. Celebrations can never be complete without something sweet, and what better than a beautiful and scrumptious cake that will ensure that the celebration is done and enjoyed to the fullest, yet you get to indulge in your sweet-tooth. If you are looking for a good bakery in the that will ensure that you get the best products and services, then your search can end here.\n" +
                "\n" +
                "Products Offered\n" +
                "\n" +
                "The wedding cakes are not only a part of the wedding tradition but also a style statement, and to ensure that your wedding cake is the most beautiful centrepiece of your wedding, then you can rely on the services of Luscious Bakers. They will bake a cake of any flavour that you want and ensure and ensure that you have a delightful experience. They can also provide you with eggless cake variants as per you taste preferences and choices.\n" +
                "\n" +
                "Apart from providing the best cakes in town, Luscious Bakers also offers bakes goodies like cupcakes, cookies, brownies, macarons and much more. The services which they can offer you include:\n" +
                "\n" +
                "->Custom designing\n" +
                "->Tasting\n" +
                "->Cake toppers\n" +
                "->Delivery\n" +
                "->Setup at venue"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cakes_seven,"Oven Fresh","3","4.6"," Kurla , Mumbai, Maharashtra 400028","1500","Oven Fresh is a coffee house providing you with bakery items both sweet and savoury that can be consumed casually or mark the celebrations of a significant event like weddings. They specialize in producing wedding cakes and offer you with great taste, flavours and variety of shapes and sizes and designs, that you and your guests will be left with asking for more. Oven Fresh started their cake making business in 1993 in Mumbai and have ever since been offering you with amazing products for various occasions.\n" +
                "\n" +
                "Products offered\n" +
                "\n" +
                "Oven Fresh offers you with a wide range of product selections to make which include the following spread:\n" +
                "\n" +
                "->Custom designed cakes\n" +
                "->Cake toppers\n" +
                "->Eggless cakes\n" +
                "->Cupcakes\n" +
                "->Cake jars\n" +
                "->Cookies\n" +
                "->Brownies\n" +
                "->Macarons\n" +
                "->Cake pops\n" +
                "Other services\n" +
                "\n" +
                "Oven Fresh also deals in offering you with flowers, gift baskets and smoothies apart from making and designing confectionary items. They provide you with baked goodies for many occasions like weddings, birthdays, anniversaries, casual festivities and even for no reason at all. Using fresh ingredients, the bakers at Oven Fresh offer you with moist cakes and other delicious items."));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingCardsData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cards_one,"AA Enterprises","4","4.2","Matchiswala Compound Santacruz West","20,000","AA Enterprises are a specialized Boxed Wedding Invitation Designer experts. They claim, \"With our Specialization in this field from the past 40 years, we bring together the best in class artwork in fancy and designer boxes and photo frames. You get numerous designs of frames to choose from with the best craftsmanship and guarantee of longevity."));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cards_two,"Flying Elephant Designs","2","4.4","Eastern Express Highway, Sion East 400022 Sion (Mumbai) ","30,000","Flying Elephant Designs is an invitation card company located in Sion East which is situated in Central Mumbai. The first thing to see at a wedding is the invitation card, and thus it needs to be perfect in every way and should give a glimpse of your wedding. It is the first thing that reaches out to your guest and hence, you would definitely want a design that you like and your guests appreciate. If you are looking for one such company that can design such invitation cards for you, then Flying Elephant Designs is the one-stop shop for you. It offers a range of user-friendly card solutions to provide you with an invitation card that you will treasure forever.\n" +
                "\n" +
                "Designs Offered\n" +
                "\n" +
                "Flying Elephant Designs offers a range of different and unique wedding cards and other related products which incorporate invitation boxes, religious invitations, floral printed, traditional digital invites, themed invitations, handcrafted cards, etc. along with regular paper invitations, premium paper cut invites, laser cut invitations, scroll invitations, contemporary invitations, and story-themed invites.\n" +
                "\n" +
                "The packages offered by Flying Elephant Designs include the design of the invite, printing, envelopes, inserts, specialized printing, packaging, accompaniments with the invite, wedding stationery design, wedding stationery printing, name and address label. This fabulous company also offers an option of international shipping available at an additional cost, so that you get your cards at your doorstep as per your convenience"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cards_three,"Itchha Talreja Designs","3","3.9","Churchgate 400020 Churchgate (Mumbai) ","30,000","Itchha Talreja Designs is the brainchild of a freelance graphic designer called Itchha Talreja. She is based out of the city of Mumbai and she specialises in personalised, sophisticated wedding invites that would reflect your personality and the wedding theme. She has come up with some of the most beautiful and creative designs that can be easily customised as per your requirements and desires.\n" +
                "\n" +
                "Services offered\n" +
                "\n" +
                "With screen, digital, indigo digital, and electroplating printing techniques, Itchha Talreja offers the following products:\n" +
                "\n" +
                "->Envelope invites\n" +
                "->Gift boxes\n" +
                "->Personalised tags on invitations\n" +
                "->Bagged invites\n" +
                "->Boxed invitations\n" +
                "->Other services\n" +
                "\n" +
                "Itchha Talreja Designs not only specialises in wedding stationery but it also offers its services for:\n" +
                "\n" +
                "->Corporate/business cards\n" +
                "->Menu cards for restaurants\n" +
                "->Baby announcements\n" +
                "->Holiday invites\n" +
                "->Hospitality and events collaterals"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cards_four,"Les Works","5","4.2","Churchgate 400020 Mumbai, Maharashtra","40,000","Les Works was created to ensure that your Wedding Invitations are a pure reflection of you, and what you want. Ketu Velani, the owner of Les Works, believes that every card should reflect the couple's story, their likes and their approach to life. Les Works will handle your requirement end to end - from any kind of paper, printing, national and international delivery and supply of additional wedding collectives.\n" +
                "\n" +
                "\n" +
                "Working Style\n" +
                "A typical design begins with the couple -\n" +
                "\n" +
                "Discussion to understand their story and expectations\n" +
                "Option suggestion by Ketu and preliminary discussion on card theme, the paper used and printing style\n" +
                "Alterations to arrive at final product as per couple's expectation\n" +
                "\n" +
                "Products Offered\n" +
                "Wedding cards\n" +
                "\n" +
                "Posters\n" +
                "\n" +
                "->Thank you cards\n" +
                "->Easel designs and return gifts\n" +
                "\n" +
                "Les Works also have sustainable paper invites -\n" +
                "\n" +
                "->seed paper\n" +
                "->flower paper\n" +
                "->texture papers\n" +
                "->Caricature and theme-based sangeet, Mehendi, cocktail, puja, wedding and reception designs"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cards_five,"Studio Works Co","2","4.2","Worli (Mumbai)","35,000","Studio Works Co. is a company based in the city of Mumbai. Whether you want a wedding card that is elegant or something that is over the top, they will deliver it all to you based on your choice and preferences. They have a creative team that works with full efforts to deliver what you are looking for. They are dedicated and work with full concentration and attention to detail making your invites attractive a long-lasting. They will deliver your products to you at your location. There is a variety for you to choose from for your grand day.\n" +
                "\n" +
                "Designs Offered\n" +
                "\n" +
                "Studio Works Co. offers the following types of wedding cards like invitation boxes, religious invitations, floral printed, traditional digital invites, themed invitations, handcrafted cards, etc. along with regular paper invitations, premium paper cut invites, laser cut invitations, scroll invitations, contemporary invitations, embossed designs, gold foil printing, letterpress printing, calligraphy designing, and story-themed invites. They even offer customisation facility for you to pitch in your ideas.\n" +
                "\n" +
                "Their package includes design od the invite, printing, envelopes, inserts, specialised printing, packaging, accompaniments with the invite, wedding stationery design, wedding stationery printing, name and address label, and the shipping within the country. Be it any occasion, they have a pattern set for all of them. They at Studio Works Co. even make other signs and symbols for the main event and make sure everything is delivered right on time without any delay."));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cakes_six,"The Papier Project","3","4.3","Andheri Lokhandwala, Andheri West (Mumbai)","50,000","The Paper Project is an invitation design company located in the Western Suburbs of Mumbai, they are one of the most creative ones in town and love to make the cards creative with their skills and talent. They have a team with running brains and active hands that will always try and make the most out of your invites. They provide shipping and are focused on the quality of both the print and the paper. At The Paper Project, you will get the most intrinsic designs and the most attractive finish.\n" +
                "\n" +
                "Designs offered\n" +
                "\n" +
                "The Paper Project offers the following types of wedding cards like invitation boxes, religious invitations, floral printed, traditional digital invites, themed invitations, handcrafted cards, etc. along with regular paper invitations, premium paper cut invites, laser cut invitations, scroll invitations, contemporary invitations, and story-themed invites. You can just put all your burden on their shoulders and they will make sure that you have the best. They even offer customization facility for you to pitch in your ideas.\n" +
                "\n" +
                "Their pacakge includes design od the invite, printing, envelopes, inserts, specialized printing, packaging, accompaniments with the invite, wedding stationery design, wedding stationery printing, name and address label, and the shipping within the country. They will give the perfect and flawless finishing to your invites so that you have a faultless designing. Make them your vendor and they will never let you down. Be it any occasion form sangeet to cocktail, they have a pattern set for all of them\n" +
                "\n" +
                "Other services\n" +
                "\n" +
                "The Paper Project not only prints wedding cards for weddings and other related events but along with this it also creates designs for many other events, such as:\n" +
                "\n" +
                "->Festivities\n" +
                "->Pre and post-wedding celebrations\n" +
                "->Naming ceremonies\n" +
                "->Inaugurations\n" +
                "->Private parties"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingCateringData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_catering_one,"Ekveera catering","3","4.1","Kajuwadi, Louiswadi Thane West, Thane - 400601","1,00,000","Established in the year 1985, Ekveera Catering Services in Thane West, Mumbai is a top player in the category Maharashtrian Caterers in the Mumbai. This well-known establishment acts as a one-stop destination servicing customers both local and from other parts of Mumbai. Over the course of its journey, this business has established a firm foothold in it’s industry. The belief that customer satisfaction is as important as their products and services, have helped this establishment garner a vast base of customers, which continues to grow by the day. This business employs individuals that are dedicated towards their respective roles and put in a lot of effort to achieve the common vision and larger goals of the company. In the near future, this business aims to expand its line of products and services and cater to a larger client base. In Mumbai, this establishment occupies a prominent location in Thane West. It is an effortless task in commuting to this establishment as there are various modes of transport readily available. It is at , Kajuwadi, Louiswadi, Opp Nitin Company, which makes it easy for first-time visitors in locating this establishment. It is known to provide top service in the following categories: Maharashtrian Caterers, Caterers, Caterers (Upto 50 Persons), Caterers (Upto 100 Persons), Caterers (Upto 500 Persons), Caterers (Upto 150 Persons), Caterers For Wedding, Caterers For Birthday Parties."));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_catering_two,"Hema Catering","2","4.2","90 Feet Road, Ghatkopar 400086 Ghatkopar East (Mumbai)","1,75,000","\n" +
                "Backed by an experience of 28 years in the industry, Hema Caterers is a catering company based out of Ghatkopar in Central Mumbai and specialises in preparing a large variety of delicacies that you can choose from for your wedding feast. \n" +
                "It provides an array of Asian to Continental menu options to create a delightful and mouth-watering platter, which your family and friends will relish on your special day. \n" +
                "With attractive presentation and decor services, the staff helps in sprucing up the food counters and ensures that the feast is a visual delight for your guests.\n" +
                "\n" +
                "Services offered\n" +
                "\n" +
                "From starters to the main course, Hema Caterers offers a large variety of dishes from diverse cuisines that you can choose to create a customised menu for all your nuptial celebrations. \n" +
                "The chefs cook at the venue so that you can get fresh and steaming hot food and enjoy the delicious treat. \n" +
                "They can cater a decent gathering of up to 750 people at one place in an event without any hassle.\n" +
                "This company also offers chocolate fountains so that your family and friends can enjoy the fondue as well as take pleasure in the sight of the waterfall of chocolate. \n" +
                "They provide services at affordable costs like:\n" +
                "->Vegetarian Menu\n" +
                "->Seafood Menu\n" +
                "->Service Staff/ Servers\n" +
                "->Crockery & cutlery\n" +
                "->Glassware\n" +
                "->Presentation and lighting for the food setup\n" +
                "->Mineral water bottles\n" +
                "->Bartender & other bar services\n" +
                "->Soft beverages, juices, sodas, tonic\n" +
                "->Chilling and cubed ice"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_catering_three,"Khasiyat","4","4.1","10th Road, Chembur East, Mumbai - 400071","2,00,00","Khasiyat Catering Services in Mumbai. Caterers with Address, Contact Number, Photos, Maps. View Khasiyat Catering Services, Mumbai on Justdial.\n" +
                "\n" +
                "Established in the year 2017, Khasiyat Catering Services in Chembur, Mumbai is an acknowledged catering establishment. This caterer has impressed countless clients with their impressionable outdoor catering services. By orienting the best of resources with dedication and commitment towards catering services, they have set their own standards in the hospitality and service industry. They toss fine, locally sourced ingredients and spices to create wholesome multi-cuisine fare. As a competent player in the city, this catering firm caters to all kinds of occasions, be it a corporate event, birthday, private party, a full-scale wedding reception or a charitable event. This eatery can be easily located in Chembur, 10th Road. Undoubtedly it is one of the best caterers in Chembur, Mumbai.\n" +
                "\n" +
                "Services offered at Khasiyat Catering Services\n" +
                "\n" +
                "Khasiyat Catering Services in Chembur aims to offer services as per the demands and preferences of the clients. This firm's catering services cover the food and beverage arrangements, dining hall décor and service. The service staff are presentable and courteous in serving and interacting with the guests. This establishment modifies its service offerings to match and suit all kinds of budgets and preferences. Be it family events, weddings or corporate events, they have the expertise to aid in each event become a rousing success. Operating on all days of the week, one can reach out to them between 10:00 - 22:00.\n" +
                "\n" +
                "Please scroll up to view the address and contact details of Khasiyat Catering Services in Chembur, Mumbai."));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_catering_four,"Malhotra","3","3.7","Pokharan Road No 01, Thane West, Thane - 400606","1,00,000","Established in the year 2006, Malhotra Caterers in Thane West, Thane, Mumbai is a top player in the category Caterers in the Thane, Mumbai. This well-known establishment acts as a one-stop destination servicing customers both local and from other parts of Thane, Mumbai. Over the course of its journey, this business has established a firm foothold in it’s industry. The belief that customer satisfaction is as important as their products and services, have helped this establishment garner a vast base of customers, which continues to grow by the day. This business employs individuals that are dedicated towards their respective roles and put in a lot of effort to achieve the common vision and larger goals of the company. In the near future, this business aims to expand its line of products and services and cater to a larger client base. In Thane, Mumbai, this establishment occupies a prominent location in Thane West. It is an effortless task in commuting to this establishment as there are various modes of transport readily available. It is at Pokharan Road No 01, Near Vartak Nagar, which makes it easy for first-time visitors in locating this establishment. The popularity of this business is evident from the 60+ reviews it has received from Justdial users."));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_catering_five,"Pratap","2","4.2","S B Patil Road, Santacruz West, Mumbai","75,000","Pratap Catering in Mumbai. Caterers with Address, Contact Number, Photos, Maps. View Pratap Catering, Mumbai on Justdial.\n" +
                "\n" +
                "Established in the year 2006, Pratap Catering in Santacruz West, Mumbai is an acknowledged catering establishment. This caterer has impressed countless clients with their impressionable outdoor catering services. By orienting the best of resources with dedication and commitment towards catering services, they have set their own standards in the hospitality and service industry. They toss fine, locally sourced ingredients and spices to create wholesome multi-cuisine fare. As a competent player in the city, this catering firm caters to all kinds of occasions, be it a corporate event, birthday, private party, a full-scale wedding reception or a charitable event. This eatery can be easily located in Santacruz West, S B Patil Road. Undoubtedly it is one of the best caterers in Santacruz West, Mumbai.\n" +
                "\n" +
                "Services offered at Pratap Catering\n" +
                "\n" +
                "Pratap Catering in Santacruz West aims to offer services as per the demands and preferences of the clients. This firm's catering services cover the food and beverage arrangements, dining hall décor and service. The service staff are presentable and courteous in serving and interacting with the guests. This establishment modifies its service offerings to match and suit all kinds of budgets and preferences. Be it family events, weddings or corporate events, they have the expertise to aid in each event become a rousing success. Operating on all days of the week, one can reach out to them between 09:30 - 18:30."));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_catering_six,"Sai catering","4","4.2","Room No 23, Chembur East, Mumbai - 400022","80,000","Established in the year 1998, Sai Caterers in Chembur East, Mumbai is a top player in the category Caterers in the Mumbai. This well-known establishment acts as a one-stop destination servicing customers both local and from other parts of Mumbai. Over the course of its journey, this business has established a firm foothold in it’s industry. The belief that customer satisfaction is as important as their products and services, have helped this establishment garner a vast base of customers, which continues to grow by the day. This business employs individuals that are dedicated towards their respective roles and put in a lot of effort to achieve the common vision and larger goals of the company. In the near future, this business aims to expand its line of products and services and cater to a larger client base. In Mumbai, this establishment occupies a prominent location in Chembur East. It is an effortless task in commuting to this establishment as there are various modes of transport readily available. It is at , Opposite HT Colony, which makes it easy for first-time visitors in locating this establishment. It is known to provide top service in the following categories: Caterers, Caterers For Wedding (Upto 2000 Persons), Mexican Caterers (Upto 1000 Persons), Continental Caterers (Upto 1000 Persons), Caterers For Birthday Parties (Upto 500 Persons), Caterers For Birthday Parties (Upto 250 Persons), Caterers For Parties (Upto 2000 Persons), Caterers For Wedding (Upto 1500 Persons).\n" +
                "\n" +
                "Products and Services offered:\n" +
                "Sai Caterers in Chembur East has a wide range of products and services to cater to the varied requirements of their customers. The staff at this establishment are courteous and prompt at providing any assistance. They readily answer any queries or questions that you may have. Pay for the product or service with ease by using any of the available modes of payment, such as Cash, Cheques. This establishment is functional from 10:00 - 22:00."));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingDecoratorsData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_decorators_one,"F5 wedding","4","4.8","New Link Road, Andheri(W) 400053 Versova (Mumbai)","2,50,000","If you're looking for your wedding to be elegant and classy with a touch of traditional, F5 Weddings can unquestionably help you with that. Its team of professional wedding planners will spend the right amount of time with you and your partner in order to help you create a unique wedding theme. Be it a royal wedding in Jaipur or a traditional marriage at your nearest wedding venue, F5 Weddings has experience in it all. It assures you that your big day will turn out to be a flawless event that will be filled with style and grandeur.\n" +
                "\n" +
                "Services offered\n" +
                "\n" +
                "F5 Weddings' professionals are very creative and they'll come up with some of the most innovative concepts for your big day to be unique and absolutely different from any other event. Having worked in all the major locations in India, the team at F5 Weddings specialises in organising high standard destination weddings. Its services include:\n" +
                "\n" +
                "->Proposal ideas\n" +
                "->Budget analysis\n" +
                "->Design and décor\n" +
                "->Wedding stationery\n" +
                "->Vendor referrals\n" +
                "->Entertainment and choreography\n" +
                "->Logistics management\n" +
                "->Wedding gifts and ideas\n" +
                "->Security and valet services"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_decorators_two,"National decorations","4","4.6"," Vile Parle-w, Bajaj Road, Mumbai","4,00,000","National Decorators was established in the year 1962 by Shri Madhusudan R. Morjaria and Smt. Pushpa M. Morjaria. The Company brings in experience of five decades and three generations. The Company in the last five decades has managed to win the hearts of thousands of satisfied clients and achieved their brand loyalty.\n" +
                "\n" +
                "Even Diamonds require a great setting to show its true spark. Unforgettable events and celebrations do not just occur. They are designed to be so. The right ambiences, the right lighting, the right setting, the right fragrances all come together to transfer your dreams into unforgettable memories.\n" +
                "\n" +
                "At National Decorators we have perfected the art of wedding design and decor we go the extra mile to make your wedding \"A dream come true\". We not only give you a chance to customize your own wedding but our team of exclusive set and 3D designers help you put it to reality. The Most important part about anything in this world is the first impression, That is what we do!! We create the first impression in the minds of the family, friends and guests , At National Decorators we strive to create the Wow!! factor, a mesmerizing feel which last forever.\n" +
                "\n" +
                "Today National Decorators has the largest infrastructure and manpower in the industry with a record number of affiliations in Mumbai, Pune and Goa.\n" +
                "\n" +
                "CREDENTIALS\n" +
                "->Licensed Electric Contractors by the P.W.D. on the AA Category of Govt of India.\n" +
                "->Well Experienced team to handle all kinds of Events.\n" +
                "->Special team for disaster management"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_decorators_three,"RV Event Entertain","2","4.4","Andheri Lokhandwala, Andheri West (Mumbai)","1,00,000","RV Event Entertainment is a wedding planning company based in the city of Mumbai. They are a team of wedding planners who are known for making all your wedding worries go away instantly. They try to innovate and give the clients one of the bests services and make their function one of a kind. The team at RV Event Entertain By Rehank efficiently makes sure you have a stress free wedding ceremony without any interruption. They are comfortable sitting with you to address all the ideas as per your necessities and wishes and make your wedding a grand affair.\n" +
                "\n" +
                "Services Offered\n" +
                "\n" +
                "Weddings are the extraordinary times of your lives and hence they plan all your functions perfectly. They plan your wedding by providing you with a set of services for each wedding function without any discomfort. With a modern approach and an exceptional attitude, their team aims in making your function one of the most beautiful lifetime remembrances. Their team of organisers each wedding function at your wedding stop without any trouble.\n" +
                "\n" +
                "RV Event Entertain By Rehank offers a wide range of hair and makeup services for you to pick as per your requirements and the budget. The wide range of services offered by them include:\n" +
                "\n" +
                "->Vendor management\n" +
                "->Event flow management\n" +
                "->Decor planning and execution\n" +
                "->Guests Management\n" +
                "->Entertainment design & choreography\n" +
                "->Transport & logistics management\n" +
                "->Food & beverage management\n" +
                "->Styling & personal shopper"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_decorators_four,"The Wedding Soul","4","4.5","400064 Kurla (Mumbai)","3,00,000","Planning and executing a wedding is a huge task. If you are looking for a good wedding planning company to plan your wedding functions then The Wedding Soul is the choice that you should make. It is a wedding planning agency based in Mumbai which provides one-stop solutions for all your wedding needs. they will ensure to make your wedding grand and eventful.\n" +
                "\n" +
                "Services Offered\n" +
                "\n" +
                "From pre-wedding to the wedding and post-wedding functions, their team of professionals hold a great experience in organising each of your functions flawlessly. They put their best efforts to fulfil all your desires and expectations to deliver maximum customer satisfaction through their outstanding services. They have great management and execution skills.\n" +
                "\n" +
                "They have a variety of options which you can customize as per your choice and budget. The wide range of services offered by them include:\n" +
                "\n" +
                "->Vendor management\n" +
                "->Event flow management\n" +
                "->Guests management\n" +
                "->Décor planning and execution\n" +
                "->Entertainment design and choreography\n" +
                "->Transport and logistics management\n" +
                "->Food and beverages management\n" +
                "->Wedding stationery\n" +
                "->Personal shoppers and stylists\n" +
                "->On-site support staff\nPlanning and executing a wedding is a huge task. If you are looking for a good wedding planning company to plan your wedding functions then The Wedding Soul is the choice that you should make. It is a wedding planning agency based in Mumbai which provides one-stop solutions for all your wedding needs. they will ensure to make your wedding grand and eventful.\n" +
                "\n" +
                "Services Offered\n" +
                "\n" +
                "From pre-wedding to the wedding and post-wedding functions, their team of professionals hold a great experience in organising each of your functions flawlessly. They put their best efforts to fulfil all your desires and expectations to deliver maximum customer satisfaction through their outstanding services. They have great management and execution skills.\n" +
                "\n" +
                "They have a variety of options which you can customize as per your choice and budget. The wide range of services offered by them include:\n" +
                "\n" +
                "->Vendor management\n" +
                "->Event flow management\n" +
                "->Guests management\n" +
                "->Décor planning and execution\n" +
                "->Entertainment design and choreography\n" +
                "->Transport and logistics management\n" +
                "->Food and beverages management\n" +
                "->Wedding stationery\n" +
                "->Personal shoppers and stylists\n" +
                "->On-site support staff\n"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_decorators_five,"Smile events and weddings","3","4.6","Mumbai","4,00,000","Smile & Celebrate is a wedding planning company based out of Ahmedabad. Due to their devotional services, they have turned themselves into a brand which speaks volumes about their work. They are readily available for consultations with regards to finding that perfect venue to function halls and so on. They are famous and known for their professional contraband of staff and personnel, each having a plethora of work experience under their belt in their restive field of expertise. What drives them to get better at what they do is their true passion for managing to deliver a great event experience for my clients.\n" +
                "\n" +
                "Services offered\n" +
                "\n" +
                "They can be with you at every step of the way to ensure that your wedding and its other related functions are planned just the way you want and proceed without any hassle. They can even travel to your wedding venue, be it within the city of outside to provide their services and make sure that your wedding is the most memorable and special event of your life, with happy memories to cherish.\n" +
                "\n" +
                "Smile & Celebrate as a company has a contraband of successful weddings under them. Some of the wedding-related services they offer are:\n" +
                "\n" +
                "->Vendor management\n" +
                "->edding Stationery\n" +
                "->Decor planning & execution\n" +
                "->Event flow management\n" +
                "->Guest management\n" +
                "->Entertainment design & choreography\n" +
                "->Transport & logistics management\n" +
                "->Food & beverage management\n" +
                "->Signages & stationery for the event\n" +
                "->Styling & personal shoppers\n" +
                "Other services offered\n" +
                "\n" +
                "From events such as birthdays, anniversaries and exhibitions to organizational centric product launches at trade fairs they do it all. Smile & Celebrate also provides quality service catering, decorations for both indoor and outdoor venues. Some of them are corporate events, celebrity management, fashion shows, modeling, promotions & product launch, kitty parties, lights & sounds and catering services."));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_decorators_six,"Uours events planer and decor","2","4.3","Andheri West, Mumbai, Maharashtra 400053","1,50,000","Uours Decorator is Mumbai based wedding decoration venture. The professionals here understand the stress and hard work behind planning and styling an event and making it way more special for the celebration of your lifetime. They would customize your parties and other events suiting your taste, style and most importantly your pocket. They provide our services throughout India. Just feel the beat and rhythm of every event with us. So, entrust them with your vision and sit back to watch your fantasy come to life!\n" +
                "\n" +
                "\n" +
                "->Panel Decorator of :\n" +
                "->Goregaon Sports Club Goregaon\n" +
                "->GCC Club Mira Road\n" +
                "->The Peninsula Grand Sakinaka\n" +
                "->Vivette Banquet Malad"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_decorators_seven,"Wedding ties","2","4.3"," Mindspace, Malad (W) 400064 Malad East (Mumbai)","3,00,000","The Wedding Ties is a wedding planner based in the city of Mumbai. Planning the perfect wedding as you have always thought can be a difficult task. As much as it seems easy through our very own Bollywood films, it can be a tedious and exhausting thing to do. That is why it becomes necessary to hire professional wedding planners, who will not only plan your wedding flawlessly but will also ensure that you are very much involved in the planning of your own wedding. If you are looking for someone like that, then your search can end here. The Wedding Ties will ensure that each of your wedding functions is planned and executed perfectly.\n" +
                "\n" +
                "Services offered\n" +
                "\n" +
                "No matter where your wedding location is, within the city or outside, they can travel anywhere and provide their services and ensure that your wedding, as well as its related events, are planned and hosted flawlessly. The Wedding Ties can provide their services for a variety of occasions which can range from your pre-wedding, wedding, to post-wedding functions. Their hardworking team will always be present to provide their assistance and ensure that each of your wedding-related events proceeds without any hassle.\n" +
                "\n" +
                "Their services can be availed at affordable prices and they can provide tailor-made packages for every client as per their needs and requirements which can be customized. The services which they can offer you include:\n" +
                "\n" +
                "->Vendor management\n" +
                "->Event flow management\n" +
                "->Decor planning and execution\n" +
                "->Guest management\n" +
                "->Entertainment design & choreography\n" +
                "->Transport & logistic management\n" +
                "->Food & beverage management\n" +
                "->Signages and stationery for the event\n" +
                "->Wedding stationary\n" +
                "->Styling & personal shopper"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingDJData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_dj_one,"Dj Blast Audio Sound","4","4.6","Sane Guru Ji Marg, Mahalaxmi 400013 Mahalaxmi (Mumbai)","5,000","\n" +
                "DJ Blast Audio Sound is a Mumbai based DJ. He is an unstoppable force, one who will uplift your occasion and turn it into a gala events of endless party and frenzy. He is well aware of the tactics of being a great DJ and how to keep the crowds wanting for more. The beats he plays are enticing and keeps the crowd craving for more. He is a great choice if you want a night of endless dancing and fervour to enjoy with your close family and friends. A man who can be trusted given to his whirlpool of talent and acquisition of praises given to his commendable service in the profession of profession music playing.\n" +
                "\n" +
                "Services offered\n" +
                "\n" +
                "DJ Blast Audio Sound offers tailor-made packages which he aligns as per the needs and desires of the bride and groom. The packages are aligned, keeping in mind the personal taste of the clients. He grasps onto the needs and tastes of the crowd he is playing for and that is what makes him a great choice for a mehndi night, a sangeet night, a cocktail party or a reception party. He is ready to travel to various other destinations as well to render his musical services.\n" +
                "\n" +
                "Specialization\n" +
                "\n" +
                "He is empanelled and has provisions to render his services to both indoor and outdoor locations. Even though he can play all kinds of music, but he specializes in playing genres such as Bollywood, EDM, House, Punjabi & Rock, International, and Hip Hop. He has a fair understanding of the music industry. He has a fair amount of experience under his belt and he knows what kind of beats to play to make the crowds swirl.\n" +
                "\n" +
                "Other services\n" +
                "\n" +
                "Great music is not restricted to only weddings and its respective ceremonies. DJ Blast Audio Sound plays at a plethora of other events as well, namely:"+"\n"+"DJ\n" +
                "->Sound equipment\n" +
                "->Light equipment\n" +
                "->Dance floor\n" +
                "->LED screens"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_dj_two,"DJ Cassino","3","4.2","Wadala East 400037 Wadala (Mumbai) ","7000","DJ Cassino is a DJ based out of Central Mumbai who offers his services at weddings. Your wedding is not only a traditional ceremony but it is also a huge social gathering that involves a lot of people who you have invited to grace your big day with their blessings and their presence to witness you start a new journey of romance and togetherness with your Mr Perfect. DJ Cassino will make sure that your guests are kept entertained and they have the time of their loves at your nuptial celebrations.\n" +
                "\n" +
                "Services offered\n" +
                "\n" +
                "DJ Cassino has a wide range of music collections to suit the mood of your family and friends at your wedding. Pranav will entertain your guests and make your occasion special with flawless services and excellent work behind the turn-table. He is a young aspiring and talented individual ready to work towards absolute client satisfaction through his music and services. He can play a variety of genres when it comes to music and it includes Bollywood, House, EDM, Hip-Hop, International, Punjabi, Rock and so on.\n" +
                "\n" +
                "He is in constant conversation with the audience to keep them engaged at all times while playing music that ranges from jazzy music to soothing tunes depending on the mood to be in sync with the ambience of the ceremonies. He has been professionally playing for 3 months now and he has a pretty commendable professional approach. He is willing to travel outstation to offer his services at your venue."));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_dj_three,"DJ Nash, Wadala","4","4.4","Wadala Village 400031 Wadala (Mumbai) ","5,000","DJ Nash also is known as Avinash Aglem is based in Mumbai. DJ Nash is a name that has been making the rounds in the business of music is one of the looked for after DJs who have been playing at weddings and related capacities for long. What do you believe is the duty of a DJ who you can enlist to play at your wedding? Is it just to play music at the service Well, not really. Any great DJ will make it his best to guarantee that his activity takes into account not simply playing the music but rather being aware of a ton of things over that. He will guarantee that the excitement never stops, from the earliest starting point until the end.\n" +
                "\n" +
                "Services Offered\n" +
                "\n" +
                "DJ Nash will guarantee that your wedding changes into an amazing event, one that has mood melodies played consistently, guaranteeing that your visitors never have a dull moment. He has played for corporate events like Citi Bank, Saraswat Bank, Tata Capital, Askme.Com, Infomedia 18 Ltd., Experian services, ONGC etc. A portion of the services he offers are DJ, sound set-up, light set-up, and a dhol to change your occasion into a fun-filled night. DJ Nash will go to destinations out of his base area to broaden his privy and music-savvy aptitude. He will turn up some incredible music tracks which will impress you as well as your guests and family members.\n" +
                "\n" +
                "He knows the genres of all types but has an expert hand in BDM - Bollywood Dance Music, EDM - Electronic Dance Music, Marathi Music/Koli Music/East Indian Music, Goan and, Konkani music along with Tamil and Gujarati Music. He can always make the crowd have an amazing time with the help of talent and understanding of the type of crowd that he is performing for."));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_dj_four,"DJ Sound","3","3.6","Imamwada Road, Sandhurst Road 400009 Mazgaon (Mumbai)","1000","Services offered\n" +
                "\n" +
                "DJ Sound offers tailor-made packages which are open for customisation as per your needs and desires.\n" +
                "Every crowd is different, and you being the host of the ceremony know your crowd better than your DJ does.\n" +
                "So, you can brief DJ Sound a little about the guestlist and he will ensure that he plays all the tracks that\n" +
                "were decided upon so that your guests have the best time of their night at one of your wedding functions.\n" +
                "\n" +
                "DJ's know a great deal about music and what's most important is to how \n" +
                "to get that crowd popping. DJ Sound tends to master that art and some of the services he offers are:\n" +
                "\n" +
                "DJ\n" +
                "->Sound equipment\n" +
                "->Light equipment\n" +
                "->Dance floor\n" +
                "->LED screens"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_dj_five,"Sound Impulse by Amit, Versova","2","4.2"," Versova Mhada 400053 Versova, Andheri West (Mumbai)","5000","Based out if the city of Mumbai, Sound Impulse by Amit is a vendor that can make your wedding night an affair of delectable sounds and melodious vibes. They offer services all over the country. Amit is a talented name that has a collection that can charm up any event and will make it a point that you enjoy your wedding functions to the maximum limit and have a blast on your special occasions. Music and sounds are something that every event needs and Sound impulse are someone who does this with passion.\n" +
                "\n" +
                "Services Offered\n" +
                "\n" +
                "Sound Impulse by Amit offers a package of services to the customers that they can select from. Apart from DJing he also makes arrangements for the lighting setup, sound system, LED screens, Dhol arrangement for Barat, projector set-up, dance floor set-up, etc. Apart from DJing he can also be an entertaining anchor and make the crowd be filled with the fun of music and vibrant sounds. Sound Impulse by Amit also listens to the requests of the crowd and delivers music accordingly.\n" +
                "\n" +
                "Sound Impulse by Amit can play any kind of music but specialises in the list of genres like desi Bollywood, Electronic Hosue, and EDM music, International beats, Punjabi Bhangra, etc. Making the hearts beat to his tune and the crowd groove to the same is what they do. Choose them for a night full of ballistic music and entertainment that you will never forget for the rest of your lives."));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_dj_six,"Volcano Sounds","4","3.9","Suncity, Vasai West 401202 Vasai (Mumbai)","8,000","Volcano Sounds is a DJ based out of Mumbai. What is an Indian wedding without good music? No matter how beautiful your wedding venue looks because of exotic floral decoration arrangements of how tasty your food is, the wedding guests will need something to keep themselves entertained while you are on the wedding stage meeting and greeting others. Having a skilled DJ at your wedding is one of those few ways in which you can provide easy and classy entertainment to your guests and yourself as well. Volcano Sounds is a known DJ who is famous for spinning tracks that are unique and has beats that won't let you get bored.\n" +
                "\n" +
                "Services Offered\n" +
                "\n" +
                "Volcano Sounds has played at a plethora of sangeet nights, mehndi ceremonies, weddings and reception parties through the long span of their profession career and have thus learnt the few tactics of good music play to ensure that the crowd is having a good time, which at a wedding happens to be one of the foremost important and essential things. From dropping some epic and mindblowing beats to creating some kickass remixes, this DJ is capable of spinning the magic of good music into your wedding festivities.\n" +
                "\n" +
                "Some of the various genres that this DJ has mastered and some of the additional services that come as a part of the basic wedding package are mentioned below:\n" +
                "\n" +
                "DJ\n" +
                "->Sound equipment\n" +
                "->Lighting equipment\n" +
                "->LED screens\n" +
                "->Anchor/ MC"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingMehendiData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_mehendi_one,"Aksha Shah Mehendi Designer","5","4.2","Mumbai","7000","Aksha Shah is based in Mumbai with an experience of over 9 years in the field of mehendi art. She is a specialist in theme conceptual bridal mehendi, Indian, Arabic as well as Dubai and designer mehendi. Mehendi, part of the bride's attire on her wedding day has a place of significance at an Indian wedding. Aksha is considered the best there is in the art of mehendi application. She does intricate embroidery work with her mehendi cones, that make her a great pick for your bridal mehendi. Her products are 100% herbal which are prepared in-house so as not cause any allergies or irritations."+"\n"+"The establishment is functional on\n" +
                "Monday:- 10:00 Am - 8:00 Pm\n" +
                "Tuesday:- 10:00 Am - 8:00 Pm\n" +
                "Wednesday:- 10:00 Am - 8:00 Pm\n" +
                "Thursday:- 10:00 Am - 8:00 Pm\n" +
                "Friday:- 10:00 Am - 8:00 Pm\n" +
                "Saturday:- 10:00 Am - 8:00 Pm\n" +
                "Sunday:- 10:00 Am - 8:00 Pm"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_mehendi_two,"Hari Om","5","4.1","Kopar Khairane, Navi Mumbai - 400709","20,000","Established in the year 2009, Hari Om Mehendi Art in Kopar Khairane, Navi Mumbai, Mumbai is a top player in the category Mehendi Artists At Home in the Navi Mumbai, Mumbai. This well-known establishment acts as a one-stop destination servicing customers both local and from other parts of Navi Mumbai, Mumbai. Over the course of its journey, this business has established a firm foothold in it’s industry. The belief that customer satisfaction is as important as their products and services, have helped this establishment garner a vast base of customers, which continues to grow by the day. This business employs individuals that are dedicated towards their respective roles and put in a lot of effort to achieve the common vision and larger goals of the company. In the near future, this business aims to expand its line of products and services and cater to a larger client base. In Navi Mumbai, Mumbai, this establishment occupies a prominent location in Kopar Khairane. It is an effortless task in commuting to this establishment as there are various modes of transport readily available. It is at Sector-18, Near Gulabsons Dairy Farm, which makes it easy for first-time visitors in locating this establishment. It is known to provide top service in the following categories: Mehendi Artists, Mehendi Artists At Home, Portrait Mehendi Artists, Bridal Mehendi Artists, Arabic Mehendi Artists.\n" +
                "\n" +
                "Products and Services offered:\n" +
                "Hari Om Mehendi Art in Kopar Khairane has a wide range of products and / or services to cater to the varied requirements of their customers. The staff at this establishment are courteous and prompt at providing any assistance. They readily answer any queries or questions that you may have. Pay for the product or service with ease by using any of the available modes of payment, such as Cash. This establishment is functional from 10:00 - 22:00.\n" +
                "\n" +
                "Please scroll to the top for the address and contact details of Hari Om Mehendi Art at Kopar Khairane, Navi Mumbai, Mumbai."+"\n"+"The establishment is functional on\n" +
                "Monday:- 10:00 Am - 10:00 Pm\n" +
                "Tuesday:- 10:00 Am - 10:00 Pm\n" +
                "Wednesday:- 10:00 Am - 10:00 Pm\n" +
                "Thursday:- 10:00 Am - 10:00 Pm\n" +
                "Friday:- 10:00 Am - 10:00 Pm\n" +
                "Saturday:- 10:00 Am - 10:00 Pm\n" +
                "Sunday:- 10:00 Am - 10:00 Pm"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_mehendi_three,"Harin's Mehndi","5","3.6","Adajan Road, Surat - 395009","25,000","Established in the year 1993, Harin Dalal Mehndi Artist in Adajan Road, Surat is a top player in the category Mehendi Artists in the Surat. This well-known establishment acts as a one-stop destination servicing customers both local and from other parts of Surat. Over the course of its journey, this business has established a firm foothold in it’s industry. The belief that customer satisfaction is as important as their products and services, have helped this establishment garner a vast base of customers, which continues to grow by the day. This business employs individuals that are dedicated towards their respective roles and put in a lot of effort to achieve the common vision and larger goals of the company. In the near future, this business aims to expand its line of products and services and cater to a larger client base. In Surat, this establishment occupies a prominent location in Adajan Road. It is an effortless task in commuting to this establishment as there are various modes of transport readily available. It is at Pal Hazira Road, Opposite RTO, which makes it easy for first-time visitors in locating this establishment. It is known to provide top service in the following categories: Mehendi Artists, Mehandi Classes, Zardosi Mehndi Artists, Mehendi Artists At Home, Bridal Mehendi Artists, Portrait Mehendi Artists."+"\n"+"The establishment is functional on\n" +
                "Monday:- 12:00 Pm - 6:00 Pm\n" +
                "Tuesday:- 12:00 Pm - 6:00 Pm\n" +
                "Wednesday:- 12:00 Pm - 6:00 Pm\n" +
                "Thursday:- 12:00 Pm - 6:00 Pm\n" +
                "Friday:- 12:00 Pm - 6:00 Pm\n" +
                "Saturday:- 12:00 Pm - 6:00 Pm\n" +
                "Sunday:- 12:00 Pm - 6:00 Pm"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_mehendi_five,"Pari Beauty Studio","4","3.6","Bhayandar West, Thane - 401101","4500","A beauty destination, Pari Beauty Studio in Bhayandar West, Mumbai has been pampering its clients since established. Serving those living and working in and around the area, this beauty destination is one of the preferred places to pamper yourself from head to toe. This establishment understands the needs of today's chic and savvy individuals and strives towards offering a diverse set of expert beauty, styling and grooming services. Aiming to go the extra mile for its clients, it not only helps you look your very best, but also helps you put your best foot forward. Enforcing impeccable quality, hygiene and hospitality standards is in this salon's DNA and is uncompromising on these fronts. It employs a team of competent and skilled professionals who are encouraged to imbibe a customer-centric focus with the belief that a customer is second to none. It is known to keep in tune with trends currently in vogue in the beauty and grooming sector. A growing base of satisfied clients is a clear testimony to its rising popularity with the citizens. Conveniently accessible, find it on Uttan Road, Near Indian Overseas Bank, Datta Mandir."+"\n"+"The establishment is functional on\n" +
                "Monday:- Closed\n" +
                "Tuesday:- 11:00 Am - 7:00 Pm\n" +
                "Wednesday:- 11:00 Am - 7:00 Pm\n" +
                "Thursday:- 11:00 Am - 7:00 Pm\n" +
                "Friday:- 11:00 Am - 7:00 Pm\n" +
                "Saturday:- 11:00 Am - 7:00 Pm\n" +
                "Sunday:- 11:00 Am - 7:00 Pm"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_mehendi_four,"Kapil Mehandi Artist","3","4.2","Dadar West, Mumbai - 400028","3100","Established in the year 2010, Kapil Mehendi Art in Dadar West, Mumbai is a top player in the category Mehendi Artists in the Mumbai. This well-known establishment acts as a one-stop destination servicing customers both local and from other parts of Mumbai. Over the course of its journey, this business has established a firm foothold in it’s industry. The belief that customer satisfaction is as important as their products and services, have helped this establishment garner a vast base of customers, which continues to grow by the day. This business employs individuals that are dedicated towards their respective roles and put in a lot of effort to achieve the common vision and larger goals of the company. In the near future, this business aims to expand its line of products and services and cater to a larger client base. In Mumbai, this establishment occupies a prominent location in Dadar West. It is an effortless task in commuting to this establishment as there are various modes of transport readily available. It is at Ranade Road, Near Sarvodaya Super Market, which makes it easy for first-time visitors in locating this establishment. It is known to provide top service in the following categories: Mehendi Artists, Bridal Mehendi Artists, Mehendi Artists At Home, Arabic Mehendi Artists"+"\n"+"The establishment is functional on\n" +
                "Monday:- 10:00 Am - 9:30 Pm\n" +
                "Tuesday:- 10:00 Am - 9:30 Pm\n" +
                "Wednesday:- 10:00 Am - 9:30 Pm\n" +
                "Thursday:- 10:00 Am - 9:30 Pm\n" +
                "Friday:- 10:00 Am - 9:30 Pm\n" +
                "Saturday:- 10:00 Am - 9:30 Pm\n" +
                "Sunday:- 10:00 Am - 9:30 Pm"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_mehendi_six,"Rahul mehandi artist","4","3.6","Andheri East, Mumbai - 400069","2300","Established in the year 2006, Rahul Mehendi Artist in Andheri East, Mumbai is a top player in the category Mehendi Artists in the Mumbai. This well-known establishment acts as a one-stop destination servicing customers both local and from other parts of Mumbai. Over the course of its journey, this business has established a firm foothold in it’s industry. The belief that customer satisfaction is as important as their products and services, have helped this establishment garner a vast base of customers, which continues to grow by the day. This business employs individuals that are dedicated towards their respective roles and put in a lot of effort to achieve the common vision and larger goals of the company. In the near future, this business aims to expand its line of products and services and cater to a larger client base. In Mumbai, this establishment occupies a prominent location in Andheri East. It is an effortless task in commuting to this establishment as there are various modes of transport readily available. It is at Old Nagardas Road, Near Station and Shri Chinai College, which makes it easy for first-time visitors in locating this establishment. It is known to provide top service in the following categories: Mehendi Artists, Mehendi Artists At Home, Bridal Mehendi Artists, Artists, Zardosi Mehndi Artists, Portrait Mehendi Artists, Arabic Mehendi Artists."+"\n"+"The establishment is functional on\n" +
                "Monday:- 10:00 Am - 10:00 Pm\n" +
                "Tuesday:- 10:00 Am - 10:00 Pm\n" +
                "Wednesday:- 10:00 Am - 10:00 Pm\n" +
                "Thursday:- 10:00 Am - 10:00 Pm\n" +
                "Friday:- 10:00 Am - 10:00 Pm\n" +
                "Saturday:- 10:00 Am - 10:00 Pm\n" +
                "Sunday:- 10:00 Am - 10:00 Pm"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_mehendi_seven,"Rohan mehndi artist","3","4.4","Dadar West, Mumbai - 400028","7,000","Established in the year 2000, Rohan Mehendi Artist in Dadar West, Mumbai is a top player in the category Mehendi Artists in the Mumbai. This well-known establishment acts as a one-stop destination servicing customers both local and from other parts of Mumbai. Over the course of its journey, this business has established a firm foothold in it’s industry. The belief that customer satisfaction is as important as their products and services, have helped this establishment garner a vast base of customers, which continues to grow by the day. This business employs individuals that are dedicated towards their respective roles and put in a lot of effort to achieve the common vision and larger goals of the company. In the near future, this business aims to expand its line of products and services and cater to a larger client base. In Mumbai, this establishment occupies a prominent location in Shivaji Nagar-govandi West. It is an effortless task in commuting to this establishment as there are various modes of transport readily available. It is at , Near Madina Masjid, which makes it easy for first-time visitors in locating this establishment. It is known to provide top service in the following categories: Mehendi Artists At Home, Bridal Mehendi Artists, Artists, Mehendi Artists."+"\n"+"The establishment is functional on\n" +
                "Monday:- 10:00 Am - 9:30 Pm\n" +
                "Tuesday:- 10:00 Am - 9:30 Pm\n" +
                "Wednesday:- 10:00 Am - 9:30 Pm\n" +
                "Thursday:- 10:00 Am - 9:30 Pm\n" +
                "Friday:- 10:00 Am - 9:30 Pm\n" +
                "Saturday:- 10:00 Am - 9:30 Pm\n" +
                "Sunday:- 10:00 Am - 9:30 Pm"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingPanditsData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_pandits_one,"Acharya Sugriv Prasad Tiwari Jyotish Services","4","4.6"," Wagle Estate, Thane West, Thane - 400604","15,000","In the Thane West, Mumbai astrologer Acharya Sugriv Prasad Tiwari Jyotish Services renowned as most skilled astrology specialist in the arcade. Astrology is a cosmic science that not only requires an astrologer degree but also need a degree of morality and commitment. Regardless of being already educated in the broad degree of intelligence, the ardent hunger for growing knowledge to learn more has led Acharya Sugriv Prasad Tiwari Jyotish Services into a varied area of astrological acumen. The years of experience, give this expert a sense of accurate predictions and give insights and solutions to clients. The lives of many have changed so far with his accurate predictions and Vedic knowledge. This establishment brings an immense change and positivity in the lives that are associated and also resolve any type of matter and guides people with the important decisions. You can seek this astrologers professional consultation for visions and predictions in matters of\n" +
                "-> Astrologers\n" +
                "-> Pandits\n" +
                "-> Pandits For Last Rites\n" +
                "-> Vastu Shastra Consultants\n" +
                "-> Pandits For Puja\n" +
                "-> Factory Vastu Shastra Consultants\n" +
                "-> Shops Vastu Shastra Consultants\n" +
                "-> Property Vastu Shastra Consultants\n" +
                "-> Office Vastu Shastra Consultants\n" +
                "-> Business Vastu Shastra Consultants"+"\n"+"Timings Monday - Sunday 9am - 9pm"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_pandits_two,"Ashish Kumar Dubey","4","3.9","Goregaon East(Mumbai)","5000","Established in the year 2011, Ashish Kumar Dubey in Goregaon East, Mumbai is a top player in the category Pandits in the Mumbai. This well-known establishment acts as a one-stop destination servicing customers both local and from other parts of Mumbai. Over the course of its journey, this business has established a firm foothold in it’s industry. The belief that customer satisfaction is as important as their products and services, have helped this establishment garner a vast base of customers, which continues to grow by the day. This business employs individuals that are dedicated towards their respective roles and put in a lot of effort to achieve the common vision and larger goals of the company. In the near future, this business aims to expand its line of products and services and cater to a larger client base. In Mumbai, this establishment occupies a prominent location in Goregaon East. It is an effortless task in commuting to this establishment as there are various modes of transport readily available. It is at Eastern Express Highway, Beside Hub Mall and Nirlon Company, which makes it easy for first-time visitors in locating this establishment. It is known to provide top service in the following categories: Pandits, Pandits For Puja, Pandits For Thila Homam, Gujarati Pandits, Arya Samaj Pandits For Namkaran, Arya Samaj Pandits For Shradh Karm, Arya Samaj Pandits For Thread Ceremony, Pandits For Seemantham."+"\n"+"Timings Monday - Sunday 24hrs\n"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_pandits_three,"Dinesh Dave","4","4.2","Vile Parle West (Mumbai)","8000","Established in the year 1990, Dinesh Dave in Vile Parle West, Mumbai is a top player in the category Pandits in the Mumbai. This well-known establishment acts as a one-stop destination servicing customers both local and from other parts of Mumbai. Over the course of its journey, this business has established a firm foothold in it’s industry. The belief that customer satisfaction is as important as their products and services, have helped this establishment garner a vast base of customers, which continues to grow by the day. This business employs individuals that are dedicated towards their respective roles and put in a lot of effort to achieve the common vision and larger goals of the company. In the near future, this business aims to expand its line of products and services and cater to a larger client base. In Mumbai, this establishment occupies a prominent location in Vile Parle West. It is an effortless task in commuting to this establishment as there are various modes of transport readily available. It is at 35 Bhagat Singh Road, Near Sanyas Ashram, which makes it easy for first-time visitors in locating this establishment. The popularity of this business is evident from the 200+ reviews it has received from Justdial users. It is known to provide top service in the following categories: Pandits, Pandits For Marriage, Pandits For Puja, Pandits For House, Pandits For New Business, Pandits For Havan, Pandits For Pitru Dosh Nivaran."+"\n"+"Timings  Monday - Sunday 8:00 Am - 9:00 Pm\n"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_pandits_four,"Pandit Shaligram Gautam","4","4.0","Andheri West, Mumbai - 400058","10,000","Established in the year 1995, Pandit Shaligram Gautam in Andheri West, Mumbai is a top player in the category Pandits in the Mumbai. This well-known establishment acts as a one-stop destination servicing customers both local and from other parts of Mumbai. Over the course of its journey, this business has established a firm foothold in it’s industry. The belief that customer satisfaction is as important as their products and services, have helped this establishment garner a vast base of customers, which continues to grow by the day. This business employs individuals that are dedicated towards their respective roles and put in a lot of effort to achieve the common vision and larger goals of the company. In the near future, this business aims to expand its line of products and services and cater to a larger client base. In Mumbai, this establishment occupies a prominent location in Andheri West. It is an effortless task in commuting to this establishment as there are various modes of transport readily available. It is at Ceaser Road, Near Filmalaya Studio, Near Shiv Sena Office, which makes it easy for first-time visitors in locating this establishment. It is known to provide top service in the following categories: Pandits, Pandits For Marriage, Pandits For Puja, Pandits For House, Pandits For New Business, Pandits For Havan."+"\n"+"Timings  Monday - Sunday 8:00 Am - 9:00 Pm\n"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_pandits_five,"Radhe Krishna Jyotish Kendra","4","3.9"," Palava City, Thane - 421204","9000","Established in the year 2011, Radhe Krishna Jyotish Kendra in Palava City, Thane, Mumbai is a top player in the category Pandits For Puja in the Thane, Mumbai. This well-known establishment acts as a one-stop destination servicing customers both local and from other parts of Thane, Mumbai. Over the course of its journey, this business has established a firm foothold in it’s industry. The belief that customer satisfaction is as important as their products and services, have helped this establishment garner a vast base of customers, which continues to grow by the day. This business employs individuals that are dedicated towards their respective roles and put in a lot of effort to achieve the common vision and larger goals of the company. In the near future, this business aims to expand its line of products and services and cater to a larger client base. In Thane, Mumbai, this establishment occupies a prominent location in Palava City. It is an effortless task in commuting to this establishment as there are various modes of transport readily available. It is at Lodha Heaven, Near Palava Phase 2 Project Office, which makes it easy for first-time visitors in locating this establishment. It is known to provide top service in the following categories: Pandits, Pandits For Puja, Pandits For Marriage, Astrologers For Janma Kundali, Vastu Shastra Consultants For Residence, Pandits For Vastu Shanti, Pandits For Pind Daan, Pandits For Havan."+"\n"+"Timings  Monday- Sunday 24hrs\n\n"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_pandits_six,"Shastri Sunil Dubey","4","4.3","Mulund West (Mumbai)","6000","Established in the year 2008, Shastri Sunil Dubey in Mulund West, Mumbai is a top player in the category Horoscope Match Making Services in the Mumbai. This well-known establishment acts as a one-stop destination servicing customers both local and from other parts of Mumbai. Over the course of its journey, this business has established a firm foothold in it’s industry. The belief that customer satisfaction is as important as their products and services, have helped this establishment garner a vast base of customers, which continues to grow by the day. This business employs individuals that are dedicated towards their respective roles and put in a lot of effort to achieve the common vision and larger goals of the company. In the near future, this business aims to expand its line of products and services and cater to a larger client base. In Mumbai, this establishment occupies a prominent location in Mulund West. It is an effortless task in commuting to this establishment as there are various modes of transport readily available. It is at Dumping Road, Opposite Trimurti Hoyel, which makes it easy for first-time visitors in locating this establishment. It is known to provide top service in the following categories: Astrologers, Pandits, Pandits For Puja, Vastu Shastra Consultants, Pandits For Marriage, Astrologers For Janma Kundali, Astrologers For Love Problem, Astrologers For Kundali Matching."+"\n"+"Monday - Sunday 9:00 Am - 10:00 Pm\n\n\n"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_pandits_seven,"Shree Saiprasad Kulkarni Guruji","4","4.2","Kalyan East , Thane - 421306","7000","Among the finest Astrologers in the city, Shree Saiprasad Kulkarni Guruji in Kalyan East, Thane, Mumbai is known for offering excellent patient care. The clinic is located centrally in Kalyan East, a prominent locality in the city. It stands close to Beside Prasadam Hotel which not only makes it convenient for people from the vicinity to consult the doctor but also for those from other neighbourhoods to seek medical guidance. There is no dearth of public modes of transport to reach the clinic from all major areas of the city.\n" +
                "\n" +
                "Services Offered:\n" +
                "\n" +
                "Shree Saiprasad Kulkarni Guruji in Kalyan East, Thane, Mumbai has a well-equipped clinic with all the modern equipment. The clinic has separate waiting and consultation areas which allow enough space for patients to wait conveniently at the clinic. Being a specialized Astrologers, the doctor offers a number of medical services. The clinic is operational between 09:00 - 21:00. Payments can be made via various modes like Cash, Cheques."));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingPhotographersData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_photographers_one,"Blu Swan Media","4","4.9"," M. G. ROAD, BORIVALI EAST Mumbai","20,000 onwards","->BLU SWAN MEDIA is a community based professional photography business given to quality portraiture and full wedding coverage. Blu swan media seeks to provide a service to individuals, couples, and families that emphasizes and enhances the quality of their relationships through photographic imaging."+"\n"+"Services & Pricing\n" +
                "Candid Photography\n" +
                "₹ 20,000 per day\n" ));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_photographers_two,"Divyesh Harchekar Photography","4","2","Mumbai","1,00,000 onwards","Divyesh Harchekar Photography since 2015 based in Mumbai & have covered more than 50 weddings till now. We are a Team of young Professionals to memorize your moments. It’s a complete package every bride and groom look for in wedding photography. We owe to our clients to deliver the best of our experience talent & wisdom. It’s a complete package every bride and groom looks for in wedding photography."+"\n"+"Services & Pricing\n" +"35,000 per day\n" +

                "1,00,000 per day\n" +
                "Photo + Video"));

        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_photographers_three,"Fantasy Filmer","4","4.2","Malad WEST,Mumbai","1,00,000 onwards","Fantasy Filmer is a wonderful photography company based in Dwarka, West Delhi. It is a one-stop solution for all your requirements to get your wedding pictures clicked. While planning a wedding, it is necessary to choose a good photography company as they are the ones who transform our joyful moments into memories for you to take a trip down the memory lane. With its inception in the year 2014, Fantasy Filmer has been covering weddings fantastically and will ensure to cover each of your precious moments in the best way possible.\n" +
                "\n" +
                "Services Offered\n" +
                "\n" +
                "The team of Fantasy Filmer is proficient at calling the right shots. From funny moments to the awestruck emotions, the team of photographers and cinematographers at this company will ensure to cover all your moments beautifully. They are ready to travel outstations for your hassle-free experience and use extraordinary-quality lenses to shoot your wedding with the utmost perfection.\n" +
                "\n" +
                "They will ensure to present your moments in a magnificent album for you to adore. Their hard work and commitment are visible in the way they cover your functions. The wide array of services offered by them include:\n" +
                "\n" +
                "Wedding photography and videography\n" +
                "Pre-wedding shoots\n" +
                "Candid photography\n" +
                "Traditional videography and photography\n" +
                "Cinematography\n" +
                "Albums"+"\n"+"Services & Pricing\n" +
                "1,00,000 per day\n" +
                "Photo + Video\n"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_photographers_four,"Marshmallow Studios","4","4.4","Mumbai","1,10,000 onwards","Marshmallow studios is unwavering about fulfilling that very motive of photography and cinematography. Capturing stories that reminiscence the little playful moments of the most unusual days of your lives. We believe in treasuring those banters for you & your dear ones and capture a story that fills up your hearts with warmth & utmost happy emotions. We are adamant when it comes to our work and want to give out results which ultimately turn into happy testimonials."+"\n"+"Services & Pricing\n" +"\n" +
                "1,10,000 per day\n" +
                "Photo + Video"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_photographers_five,"MVB PRoDUCTION","4","3.9","Santacruz East, Mumbai","40,000 onwards","Based in Mumbai, MVB Productions is a well-known wedding videographer with more than 8 years of experience in the industry. He blends his experience of people and portraits into wedding videography to add that touch of glamour. They ensure to envelope all the overwhelming emotions, special glasses and brightest smile in their videos. They honestly believe to give people more than they expect from them. Well-equipped with modern tools and techniques of Candid Photography and Cinematography. So, capture the memories of all your. nuptial ceremonies and events through their skilled services. Services Offered: Lip Dub Videos Save the Date Videos Wedding Films Teaser Videos Still Photography Candid & Portrait Photography"+"Services & Pricing\n" +"40,000 per day\n" +
                "Photo + Video"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_photographers_six,"Peppermint Pictures","4","4.1","Mira Road, Mira Bhayandar, Maharashtra","90,000 onwards","Peppermint Pictures is a photography & filming collective based out of Mumbai, India. They specialize in creating real and fun imagery for couples, families, and events. Their motto is \"Live for the moments you can't put into words\". They believe that wedding photography is much more than just prett y pictures. It is an experience that should be as delightful as your wedding celebrations! Been in the wedding industry for over 7 years now the brand offers exceptional traditional and candid photography for a stunning wedding affair."+"\n"+"Services & Pricing\n" +"\n"+"90,000 per day\n" +
                "Photo + Video"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_photographers_seven,"THE MEMORY CAPTURE","4","3.9","Malad East (Mumbai)","45,000 onwards","The Memory Capture is a wedding photography and videography company based in the city of Mumbai. The team of highly equipped and experienced narrators will tell a perfect love story through their lens. Therefore if you are on a lookout for a wedding cinematographer who chronicles each of your wedding celebrations honestly and perfectly, then your search ends with The Memory Capture. With over 3 years of professionals experience, you can choose them for all your wedding functions.\n" +
                "\n" +
                "Services Offered\n" +
                "\n" +
                "They have a team of qualified cinematographers and union photographers who are known for their work and impeccable services that are given to you at budget-friendly packages. Whether you plan a residential wedding or a destination wedding, the team of experts are ready to travel with you both within the city as well as outdoor as per your needs and wishes. The final images are delivered within a month and that too in high-definition!\n" +
                "\n" +
                "The Memory Capture has a team that is known for attempting a wide range of services that you can choose according to your needs and wishes. The plethora of services offered by them at budget-friendly rates are:\n" +
                "\n" +
                "->Candid Photography\n" +
                "->Traditional Photography\n" +
                "->Pre-wedding shoots\n" +
                "->Cinematography\n" +
                "->Traditional Videography\n" +
                "->Albums"+"\n"+"45,000 per day\n" +
                "Photo + Video"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingVenuesData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_venue_one,"Kiaraa Banquet hall","4","4.2","Road No 16 Z, Thane West, Thane - 400604","10000 onwards","\n" +
                "Kiaraa Banquet in Mumbai. AC Banquet Halls with Address, Contact Number, Photos, Maps. View Kiaraa Banquet, Mumbai on Justdial.\n" +
                "\n" +
                "Established in 2016, Kiaraa Banquet in Thane West, Mumbai. is one of the most sought after one banqueting facilities in the city. It was setup with a view to provide an elegant and superior banqueting space to cater to the varied requirements of their clients. Whatever the celebration may be, big or small, it is this firm's endeavour to make each celebration, a rousing success. It is one of the preferential venue partners to host corporate events as well as intimate gatherings and ceremonies like birthday bashes, mehendi, haldi, weddings or receptions. Occupying a favourable location Road No 16Z, this grand banqueting facility is at a strategically advantageous spot. On the Road No 16Z, it is at an unmistakable location. It is one of the best banquet halls in Thane West, Mumbai.\n" +
                "\n" +
                "Address: Ashar It Park, Road No 16 Z, Thane West, Thane - 400604, Wagle Estate\n" +
                "\n" +
                "Hours of operation:- Monday - Sunday  9:00 Am - 10:00 Pm"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_venue_two," Lavender Bough","4","4.8"," 90 Feet Road, Ghatkopar East, Mumbai - 400077","20000 onwards","Lavender Bough in Ghatkopar, Mumbai\n" +
                "Right in the heart of central suburbs, Lavender Bough Mumbai has made a name for itself when it comes to being one of the most finest luxury destinations amongst the prime Hotels in Ghatkopar East. Situated right next to Swami Narayan temple, the hotel attracts a lot of corporate as well as leisure travellers. The hotel is known foe its lavish rooms, gigantic banquets and conference halls and superb restaurants. Due to its location it serves as a common attraction to the corporate firms around the area. One is greeted by a well mannered and trained staff who look after your visit and provide effective solutions to all your queries as soon as you step into the edifice. Also the hotel has a huge parking space, so one does not have to worry about the safety of their vehicles. Due to its location it is also in close proximity to one of the most premium malls in Mumbai- The R City mall.\n" +
                "\n" +
                "Accommodation at Lavender Bough, Ghatkopar East\n" +
                "Lavender Bough is home to 33 guest rooms for accommodations. The rooms are known for their classy interior, which make for a very pleasant stay. All rooms have 24 hrs Rooms Service, Laundry Service, 24 hrs Hot & Cold Water, Safety locker system, Mini bar facility, Broad band Internet facility, Multi Channel Satellite T.V., Direct Dialing. They also provide additional services like Rent a car and Valet Parking. They have set the check-in and check-out timings as 9 am and 9 pm respectively, so that every visitor has a hassle free experience. The quick and subtle service amalgamated with the grandeur and the simplicity of their rooms makes for a memorable stay.\n" +
                "\n" +
                "Address: Plot No 204, 90 Feet Road, Ghatkopar East, Mumbai - 400077, Next to Swami Narayan Temple\n" +
                "\n" +
                "Hours of operation:-  Monday - Sunday 10:00 Am - 10:00 Pm\n"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_venue_three,"Pracharya B N Vaidya Sabhagriha","4","4.3","Sir Bhalchandra Road, Dadar East, Mumbai - 400014","15000 onwards","\n" +
                "Pracharya B N Vaidya Sabhagriha in Dadar East, Mumbai. is one of the most sought after one banqueting facilities in the city. It was setup with a view to provide an elegant and superior banqueting space to cater to the varied requirements of their clients. Whatever the celebration may be, big or small, it is this firm's endeavour to make each celebration, a rousing success. It is one of the preferential venue partners to host corporate events as well as intimate gatherings and ceremonies like birthday bashes, mehendi, haldi, weddings or receptions. Occupying a favourable location L N Road, this grand banqueting facility is at a strategically advantageous spot. On the L N Road, it is at an unmistakable location. It is one of the best banquet halls in Dadar East, Mumbai.\n" +
                "\n" +
                "Address:- Raja Shivaji Vidyasankul Campus, Sir Bhalchandra Road, Dadar East, Mumbai - 400014, Near IES Orion School, Hindu Colony\n" +
                "\n" +
                "Hours of operation:- Monday - Sunday 10:00 Am - 6:00 Pm\n"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_venue_four," Rangsharda Auditorium","4","4.0","Bandra Reclamation-bandra West, Mumbai - 400050","10000 onwards","\n" +
                "Rangsharda Auditorium is an extension of the Rangsharda hotel and is known for hosting various historic plays. It is located at a walking distance from the hotel in Bandra, Mumbai.\n" +
                "\n" +
                "Offering a decent sound system and lighting equipments, this auditorium is a favorite venue for hosting theatrical performances. The Auditorium is equipped with seating capacity of about 800 seats it is one of most famous auditorium situated in the city. It is a forerunner in catalyzing the growth of theatre and other performing arts in the country.\n" +
                "\n" +
                "Rangsharda Auditorium is attached to a Banquet Hall which has conference facilities to accommodate 250 persons and is ideal for corporate general meeting, seminars, lectures, discourses and other recreational activities. It also hosts a number of live performances and shows quite often.\n" +
                "\n" +
                "The auditorium hosts theatrical acts of different genres every week. It is an ideal place for theatre enthusiast to spend their weekend, getting enamored by the esteemed theatre artists at their best!"+"\n"+"Hours of operation  Monday - Sunday 11:30 Am - 5:00 Pm\n"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_venue_five,"AnnaSaheb Vartak Hall","4","4.2","Near Kabutar Khana, Dadar West, Mumbai - 400028","20000 onwards","Annasaheb Vartak Hall is a banquet hall located in Dadar , Mumbai .The banquet hall seating capacity is 600 and floating capacity is 600.This venue has car parking capacity is 50 cars. Outside food not allowed at this banquet hall.Events permitted at Annasaheb Vartak Hall are Engagement,Wedding Reception,Birthday Party,Get Together Party,Anniversary,Kitty Party,Naming Ceremony.. Check availabity online for Annasaheb Vartak Hall,Dadar, Mumbai Birthday party cost in Annasaheb Vartak Hall. Wedding cost in Annasaheb Vartak Hall Dadar Mumbai\n"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_venue_six,"ILeaf Ritz Banquets","3","4.3"," R Mall, 3rd Floor, Ghodbunder Road, Thane West, Thane","12000 onwards","The iLeaf Ritz Banquets located in Thane West, Mumbai has Cocktail Venues and Banquet Halls. Diamond can accommodate upto 600 guests in seating and 900 guests in floating. Pearl can accommodate upto 150 guests in seating and 250 guests in floating. Ruby can accommodate upto 250 guests in seating and 400 guests in floating. \n" +
                "Vegetarian and Non Vegetarian food is served at this venue. Features of this wedding venues are : \n" +
                "Food provided by the venue \n" +
                "Non-Veg allowed at the venue \n" +
                "Alcohol allowed at the venue \n" +
                "Outside alcohol allowed at the venue \n" +
                "Halls are air Conditioned \n" +
                "Baarat allowed \n" +
                "Hawan allowed \n" +
                "Overnight wedding allowed \n" +
                "Decor provided by the venue \n" +
                "Packages starts at Rs 1,050 per plate for vegetarian\n" +
                "Packages starts at Rs 1,250 per plate for non-vegetarian"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingMakeupData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_makeup_one,"Bridal Makeup Artist Kriti B","4","4.2","Near CIDCO Exhibition Centre 400703 Vashi","1400 Onwards",""));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_makeup_two,"Farah Charna Hair & Makeup","4","4.2","Bandra 400050 Kurla (Mumbai)","5000 onwards","Services Offered\n" + "\n" +"Farah Charna is a person, who is skilful and experienced enough to\n" +
                "now what her clients want for their special day. Her approach to makeup \n" +
                "is very modern, highlighting the best features of the face and presenting a \n" +
                "bride in a more natural but beautiful looking way than go for the traditional over -the -top look."+"\n"+
                "\n" +
                "Her talents are complemented by her insistence on using top \n" +
                "of the line beauty products and utilising them with flair and creativity.\n" +
                "For the most special day of your life, she will be at the location of your choice,\n" +
                "providing bridal makeup, hairstyling and along with dress draping. She is available \n" +
                "for other wedding related events and social functions and also, for fashion shoots."));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_makeup_three,"Glamup by Sonali","4","4.0","vile parle 400057 Vile Parle East (Mumbai)","7000 onwards","Services Offered\n" + "\n" +
                "The team of Glamup by Sonal can offer you a plethora of services, \n" +
                "each one of which would be aimed at ensuring that you look flawless \n" +
                "and the most gorgeous self on your wedding as well as its other related functions.\n" +
                "They use only the best and premium range of makeup products so that they can create magic\n" +
                "through their brushes, and you can look ever the most glorious for your wedding festivities. \n" +
                "They are your one-stop solution for all your beauty needs with their expertise.\n" +
                "\n" +
                "The team of Glamup by Sonal is willing to travel to any location, \n" +
                "no matter where you decided to get married and offer their services. \n"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_makeup_four,"Hiya Makeup Studio","4","4.5","BR Road, Vaishali Naga 400080 Mulund West (Mumbai)","1000 onwards","Services Offered\n" +
                "\n" +
                "The team at, Hiya Makeup Studio are highly trained and never forgets to add a pinch of exquisiteness\n" +
                "in every stroke of the makeup. She is a one-stop answer for all your wedding-related needs and \n" +
                "demands and makes sure the bride looks like a princess on her D-day. Planning a wedding getaway? \n" +
                "If yes, then she with her team is ready to travel around the cities and offer an amazing experience \n" +
                "to you and your family members.\n" +
                "\n" +
                "Hiya Makeup Studio provides a plethora of services and \n" +
                "facilities which can be updated as per your needs and budget demands. \n" +
                "Some of the services that she can offer include the following:"+"\n"+"->Regular make-up\n" +
                "-> HD make-up\n" +
                "->Air Brush make-up\n" +
                "->Party make-up (for pre-weddings and post-weddings)\n" +
                "->Friends and family make-up\n" +
                "->Hair Styling\n" +
                "->Hair Extensions\n" +
                "->Eyelashes\n" +
                "->Mehndi\n" +
                "->Draping\n" +
                "->Nails"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_makeup_five,"Image Maker Makeup & Hair Academy","3","3.9","Andheri east 400001 Marol, Andheri East (Mumbai)","3000 onwards","Services offered\n" +
                "\n" +
                "Image Maker Makeup & Hair Academy includes a wide range of services in its bridal package. \n" +
                "According to your budget requirements and individual needs, you may choose among the following services:\n" +
                "\n" +
                "Makeup: eye makeup, contouring, HD, etc.\n" +
                "Hairstyling\n" +
                "Hairdressing\n" +
                "Dupatta setting and draping\n" +
                "Jewellery styling"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_makeup_six,"Namita Makeover","4","3.9","Owale, Thane West (Mumbai)","2000 onwards","Services Offered\n" + "\n" +"Navita Makeover will be with you every step of the way and you will be\n" +
                "left utmostly satisfied with her flair for makeup. Some of the services \n" +
                "she offers are mentioned below:\n" +
                "\n" +
                "Regular make-up\n" +
                "HD make-up\n" +
                "Air Brush make-up\n" +
                "Party make-up (for pre-weddings and post-weddings)\n" +
                "Friends and family make-up\n" +
                "Hair Styling\n" +
                "Hair Extensions\n" +
                "Eyelashes\n" +
                "Shampoo\n" +
                "Draping\n" +
                "Nails"));
        list.setValue(listDetailItems);
        return list;
    }
}
