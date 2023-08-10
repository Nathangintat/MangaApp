package com.example.mabgaaapp

data class Manga(
    val id: String,
    val name: String,
    val imageUrl: String,
    val chapter: Int,
    val rating: Double,
    val description: String
)

private val dummyDescription = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Felis bibendum ut tristique et egestas quis ipsum. Justo donec enim diam vulputate ut pharetra sit. Magna etiam tempor orci eu lobortis elementum nibh. Orci porta non pulvinar neque laoreet suspendisse. Sagittis orci a scelerisque purus semper eget duis. Dignissim convallis aenean et tortor at risus viverra adipiscing. A diam sollicitudin tempor id eu nisl. At risus viverra adipiscing at. Sed cras ornare arcu dui vivamus arcu. Consectetur a erat nam at lectus urna duis convallis convallis. Faucibus scelerisque eleifend donec pretium vulputate sapien nec sagittis.\n" +
        "\n" +
        "Turpis massa tincidunt dui ut ornare. Amet nulla facilisi morbi tempus iaculis. Quam adipiscing vitae proin sagittis nisl rhoncus. Facilisis magna etiam tempor orci eu lobortis elementum. Nullam eget felis eget nunc. Leo vel fringilla est ullamcorper eget. Purus viverra accumsan in nisl nisi. Sodales ut etiam sit amet. Tristique senectus et netus et malesuada fames ac turpis. Duis ultricies lacus sed turpis tincidunt id aliquet risus feugiat. Quam quisque id diam vel quam. Felis bibendum ut tristique et egestas quis. Felis eget velit aliquet sagittis id consectetur. Posuere lorem ipsum dolor sit. Venenatis lectus magna fringilla urna. Eu non diam phasellus vestibulum lorem."

val dummyManga = listOf(
    Manga(
        id = "1",
        name = "One Piece",
        imageUrl = "https://www.manga-news.com/public/images/vols/One-piece-52-shueisha.jpg",
        chapter = 1000,
        rating = 5.0,
        description = dummyDescription
    ),
    Manga(
        id = "2",
        name = "Solo Leveling",
        imageUrl = "https://lightnovelbrasil.com/wp-content/uploads/2021/07/download.jpg",
        chapter = 210,
        rating = 4.9,
        description = dummyDescription
    ),
    Manga(
        id = "3",
        name = "Tensei Kizoku no Isekai Boukenroku",
        imageUrl = "https://www.remanhwa.com/storage/tensei-kizoku-no-isekai-boukenroku-jichou-wo-shiranai-kamigami-no-shito.jpg",
        chapter = 53,
        rating = 4.0,
        description = dummyDescription
    ),
    Manga(
        id = "4",
        name = "Tensei Shitara Slime Datta Ken",
        imageUrl = "https://res.booklive.jp/266818/006/thumbnail/X.jpg",
        chapter = 70,
        rating = 4.5,
        description = dummyDescription
    ),
    Manga(
        id = "5",
        name = "Isekai wa Smartphone to Tomo ni",
        imageUrl = "https://www.animeclick.it/immagini/novel/Isekai_wa_Smartphone_no_Tomo_ni/cover/Isekai_wa_Smartphone_no_Tomo_ni-cover.jpg",
        chapter = 90,
        rating = 4.2,
        description = dummyDescription
    ),
    Manga(
        id = "6",
        name = "The Villain of Destiny",
        imageUrl = "https://i3.wp.com/masterkomik.com/wp-content/uploads/2021/11/I-Am-the-Fated-Villain.jpg",
        chapter = 96,
        rating = 4.7,
        description = dummyDescription
    ),
    Manga(
        id = "7",
        name = "Kimetsu no Yaiba",
        imageUrl = "https://i.pinimg.com/originals/86/1d/95/861d95dc646bec1dedde1586adf896e3.jpg",
        chapter = 205,
        rating = 3.0,
        description = dummyDescription
    ),
    Manga(
        id = "8",
        name = "Attack On Titan",
        imageUrl = "https://i.pinimg.com/originals/96/d3/a5/96d3a5bca1fcaa6e9e4775d3397eb202.jpg",
        chapter = 139,
        rating = 2.0,
        description = dummyDescription
    ),
    Manga(
        id = "9",
        name = "Kage no Jitsuryokusha ni naritakute",
        imageUrl = "https://i.pinimg.com/736x/a1/26/52/a1265267cd0ed48d565ad3cd5e4224d8.jpg",
        chapter = 55,
        rating = 4.8,
        description = dummyDescription
    ),
    Manga(
        id = "10",
        name = "Berserk of Gluttony",
        imageUrl = "https://readkomik.com/wp-content/uploads/2021/01/23941.jpg",
        chapter = 51,
        rating = 4.2,
        description = dummyDescription
    ),
    Manga(
        id = "11",
        name = "Berserk of Gluttony",
        imageUrl = "https://readkomik.com/wp-content/uploads/2021/01/23941.jpg",
        chapter = 51,
        rating = 4.2,
        description = dummyDescription
    )

)