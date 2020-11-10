package com.example.desafio_2

class RestaurantsDataClass() {

    lateinit var tonyRomas: Restaurant
    lateinit var aoyama: Restaurant
    lateinit var outback: Restaurant
    lateinit var siSenor: Restaurant

    init {
        setRestaurantProperties()
    }

    private fun setRestaurantProperties() {
        tonyRomas = Restaurant(
            "Tony Roma's",
"https://image.freepik.com/fotos-gratis/salgadinhos-na-mesa_144627-46196.jpg",
            "Av. Lavandisca, 717 - Indianópolis, São Paulo",
            "22:00",
            mutableListOf(
                ItemMenu(
                    "https://jeanetteshealthyliving.com/wp-content/uploads/2012/08/Carrot-Ginger-Dressing.jpg",
                    "salad with ginger dressing",
                    "This ginger dressing is a healthy alternative to hibachi style salad dressing. It works with any Asian inspired salad and it’s naturally vegan (swap the soy to make it gluten free)."),
                ItemMenu(
                    "https://1d2zve3mn4ws4a53nqmjcor1-wpengine.netdna-ssl.com/wp-content/uploads/2014/11/Onion-Loafao_lowres-868x383.jpg",
                    "Onion Loaf",
                "Giant hand-cut Spanish onions, breaded, deep fried and served with TR’s Original BBQ sauce."),
                ItemMenu(
                    "https://1d2zve3mn4ws4a53nqmjcor1-wpengine.netdna-ssl.com/wp-content/uploads/2014/11/KickinShrimp-513x366.jpg",
                    "Kickin’ Shrimp",
                    "Tempt your taste buds with tender shrimp fried crispy and tossed in a spicy, cream sauce exploding with flavor."
                ),
                ItemMenu(
                    "https://1d2zve3mn4ws4a53nqmjcor1-wpengine.netdna-ssl.com/wp-content/uploads/2014/11/Baby-Back-Ribs-on-Board-868x383.jpg",
                    "The Original Baby Back Ribs",
                    "Tender, lean pork loin meat, basted with TR’s Original™ BBQ sauce or your choice of one of our other delicious sauces."
                ),
            )
        )

        aoyama = Restaurant(
            "Aoyama - Moema",
            "https://yata-apix-f2414b5e-b6d4-4865-88fc-6f44cc6f6494.lss.locawebcorp.com.br/a2159835ab424d0eb7a014416aade2b6.jpg",
            "Alameda dos Arapanés, 532 - Moema",
            "00:00",
            mutableListOf(
                ItemMenu(
                    "https://yata-apix-f2414b5e-b6d4-4865-88fc-6f44cc6f6494.lss.locawebcorp.com.br/e88aaaa4f4fa48a7a86b869077f26430.jpg",
                    "Sushi (寿司 or 鮨)",
                    "the most famous Japanese dish outside of Japan, and one of the most popular dishes among the Japanese. In Japan, sushi is usually enjoyed on special occasions, such as a celebration."
                ),
                ItemMenu(
                    "https://yata-apix-f2414b5e-b6d4-4865-88fc-6f44cc6f6494.lss.locawebcorp.com.br/84cc5c660a044b8ea46ad86f1f95ee86.jpg",
                    "Petit gâteau",
                    "Dessert composed of a small chocolate cake with crunchy rind and mellow filling that is conventionally served hot with vanilla ice cream on a plate"),
            )
        )

        outback = Restaurant(
            "Outback - Moema",
            "https://s3.amazonaws.com/institucional-statics-files/site/uploads/quem_somos_segundo_header-1024x165.png",
            "Av. Moaci, 187, 187 - Moema, São Paulo",
            "00:00",
            mutableListOf(
                ItemMenu(
                    "https://s3.amazonaws.com/institucional-statics-files/site/uploads/Outback-Fries_305x342-305x250.png",
                    "Aussie Cheese Fries",
                    "Topped with melted Monterey Jack, Cheddar and chopped bacon with house-made ranch dressing. Available in small and large size."
                ),
                ItemMenu(
                    "https://s3.amazonaws.com/institucional-statics-files/site/uploads/Bloomin_Onion_cmyk_outback-225x253.png",
                    "BLOOMIN' ONION",
                    "An Outback Original! Our special onion is hand-carved, cooked until golden and ready to dip into our spicy signature bloom sauce."
                ),
                ItemMenu(
                    "https://az815214.vo.msecnd.net/web/categories/GSB/ccapp-GSB-2x.png",
                    "GRILLED SHRIMP ON THE BARBIE",
                    "Sprinkled with a special blend of seasonings and grilled. Served with grilled artisan bread, garlic herb butter and fresh tomato basil."
                ),
                ItemMenu(
                    "https://az815214.vo.msecnd.net/web/categories/chickenTortillaSoup/ccapp-chickenTortillaSoup-2x.png",
                    "CHICKEN TORTILLA SOUP",
                    "Chicken breast in a seasoned broth, topped with Monterey Jack and Cheddar cheese, cilantro and crispy tortilla strips. Served with a wedge of lime. Available in a cup or bowl."
                )
            )
        )

        siSenor = Restaurant(
            "Sí Señor!",
            "https://media-cdn.tripadvisor.com/media/photo-s/10/5f/2d/54/crunch-tacos.jpg",
            "Alameda Jauaperi, 626 - Moema",
            "01:00",
            mutableListOf(
                ItemMenu(
                    "https://pepes.com/_image/_menu/_nachos/nacho-grande-paltter.png",
                    "Nacho Platter",
                    "Tortilla chips layered with your choice of melted jalapeño cheese sauce or melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.",
                ),
                ItemMenu(
                    "https://pepes.com/_image/_menu/_ensalada/taco-salad.jpg",
                    "Taco Salad",
                    "Garden fresh vegetables, smothered with your choice of filling: beef, chicken or pork, and topped with shredded cheddar cheese."
                ),
                ItemMenu(
                    "https://pepes.com/_image/_menu/_asador/mariachis.jpg",
                    "Mariachis Mexican shish-ka-bob!",
                    "Skirt steak or chicken breast, with bell peppers, tomatoes and Spanish onions; broiled and served on skewers."
                ),
                ItemMenu(
                    "https://pepes.com/_image/_menu/_botanas/el-presidente.png",
                    "El Presidente",
                    "Mouth watering Queso Fundido with grilled steak garnachas. Served sizzling hot in a cast iron skillet."
                ),
            )
        )
    }
}