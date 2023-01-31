package com.example.iman_tulenaliev

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.iman_tulenaliev.databinding.ActivityMainBinding

lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClick()
        setOnLongClick()
    }

    private fun setOnLongClick() {
        binding.buttonMessi.setOnLongClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            val footbalist = Footbalist(
                "Лионе́ль Андре́с Ме́сси Куччитти́ни[a] (исп. Lionel Andrés Messi Cuccittini, испанское произношение: [ljoˈnel anˈdɾez ˈmesi] (Звук слушать); родился 24 июня 1987, Росарио, Аргентина) — аргентинский футболист, нападающий клуба «Пари Сен-Жермен», капитан сборной Аргентины. Олимпийский чемпион, чемпион Южной Америки, чемпион мира.",
                "Messi",
                "https://i.pinimg.com/originals/ac/fb/36/acfb364074b4a7e79cb5a62e7bc0b9e9.jpg"
            )
            intent.putExtra("footbalist", footbalist)
            startActivity(intent)
            true
        }
        binding.buttonRamires.setOnLongClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            val footbalist = Footbalist(
                "Рами́рес Са́нтос до Насиме́нто (порт. Ramires Santos do Nascimento; родился 24 марта 1987 года, в Рио-де-Жанейро, Бразилия) — бразильский футболист, полузащитник. Выступал в сборной Бразилии.",
                "Ramires", "https://miro.medium.com/max/1200/1*7QIsnmz75Wv20OgvBmrJNQ.jpeg"
            )
            intent.putExtra("footbalist", footbalist)
            startActivity(intent)
            true
        }
        binding.buttonBenzema.setOnLongClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            val footbalist = Footbalist(
                "Кари́м Мостафа́ Бензема́ (фр. Karim Mostafa Benzema; род. 19 декабря 1987[4][5][…], Лион[8][9]) — французский футболист, нападающий и капитан испанского клуба «Реал Мадрид». Выступал за сборную Франции, за которую провёл 97 матчей и забил 37 мячей.",
                "Benzema", "https://www3.pictures.zimbio.com/gi/Karim+Benzema+Real+Madrid+v+Los+Angeles+Galaxy+HMzSo6JgPwrx.jpg"
            )
            intent.putExtra("footbalist", footbalist)
            startActivity(intent)
            true
        }
        binding.buttonNeymar.setOnLongClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            val footbalist = Footbalist(
                "Нейма́р да Си́лва Са́нтос Жу́ниор (порт. Neymar da Silva Santos Júnior; португальское произношение: [nejˈmaʁ dɐ ˈsiwvɐ ˈsɐ̃tus ˈʒũɲoʁ]; род. 5 февраля 1992, Можи-дас-Крузис, штат Сан-Паулу, Бразилия)[5], или же просто Нейма́р (порт. Neymar) — бразильский футболист, нападающий, вингер и атакующий полузащитник французского клуба «Пари Сен-Жермен» и национальной сборной Бразилии. Считается одним из лучших игроков в мире[6][7][8]. Лучший бомбардир сборной Бразилии, наряду с Пеле (по 77 голов).",
                "Neymar", "https://www.desktopbackground.org/download/3840x2400/2014/04/09/744306_malaga-vs-barcelona-gerardo-martino-to-square-off-against-bernd_4256x2832_h.jpg"
            )
            intent.putExtra("footbalist", footbalist)
            startActivity(intent)
            true
        }
        binding.buttonPirlo.setOnLongClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            val footbalist = Footbalist(
                "Андре́а Пи́рло (итал. Andrea Pirlo; род. 19 мая 1979, Флеро, Ломбардия, Италия) — итальянский тренер, ранее футболист, игравший на позиции центрального полузащитника.",
                "Pirlo", "https://cdn.givemesport.com/wp-content/uploads/2022/02/GettyImages-154015732-2048x1548.jpg"
            )
            intent.putExtra("footbalist", footbalist)
            startActivity(intent)
            true
        }
        binding.buttonIbragimovic.setOnLongClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            val footbalist = Footbalist(
                "Зла́тан Ибраги́мович (швед. и босн. Zlatan Ibrahimović, шведское произношение: [ˈslaːtan ɪbraˈhiːmɔvɪtɕ]; род. 3 октября 1981, Мальмё) — шведский футболист, нападающий итальянского клуба «Милан». Бывший капитан сборной Швеции.",
                "Ibragimovic", "https://cdn.yenicaggazetesi.com.tr/news/2021/04/230420210345423373378.jpg"
            )
            intent.putExtra("footbalist", footbalist)
            startActivity(intent)
            true
        }
        binding.buttonBale.setOnLongClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            val footbalist = Footbalist(
                "Га́рет Фрэнк Бейл (англ. Gareth Frank Bale, валл. Garedd Fruaing Baill; род. 16 июля 1989[2][3][…], Кардифф) — валлийский футболист, выступавший на позиции крайнего нападающего. Играл в национальной сборной Уэльса. Отличался высокой скоростью и хорошо поставленным ударом.",
                "Bale", "https://metaratings.ru/upload/iblock/cc2/cc2e0723e60fb665d0c125f8033dcfc2.jpg"
            )
            intent.putExtra("footbalist", footbalist)
            startActivity(intent)
            true
        }
        binding.buttonCasillas.setOnLongClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            val footbalist = Footbalist(
                "И́кер Каси́льяс Ферна́ндес (исп. Iker Casillas Fernández; род. 20 мая 1981, Мостолес, Мадрид, Испания) — испанский футболист, выступавший на позиции вратаря. Экс-капитан национальной сборной Испании. Чемпион мира (2010) и двукратный чемпион Европы (2008 и 2012)[8]. Признаётся одним из лучших вратарей всех времён[9].",
                "Casillas", "https://i.trbna.com/preset/wysiwyg/7/0c/b4df2260711ebb3b8d88e8b7aa0ca.jpeg"
            )
            intent.putExtra("footbalist", footbalist)
            startActivity(intent)
            true
        }
    }

    private fun setOnClick() {
        binding.buttonCasillas.setOnClickListener {
            Glide.with(this).load(getString(R.string.casillas_image)).into(
                binding.imageViewIcon
            )
        }
        binding.buttonBale.setOnClickListener {
            Glide.with(this).load(getString(R.string.bale_image)).into(
                binding.imageViewIcon
            )
        }
        binding.buttonIbragimovic.setOnClickListener {
            Glide.with(this).load(getString(R.string.ibragimovic_image)).into(
                binding.imageViewIcon
            )
        }
        binding.buttonPirlo.setOnClickListener {
            Glide.with(this).load(getString(R.string.pirlo_image)).into(
                binding.imageViewIcon
            )
        }
        binding.buttonNeymar.setOnClickListener {
            Glide.with(this).load(getString(R.string.neymar_image)).into(
                binding.imageViewIcon
            )
        }
        binding.buttonBenzema.setOnClickListener {
            Glide.with(this).load(getString(R.string.benzema_image)).into(
                binding.imageViewIcon
            )
        }
        binding.buttonRamires.setOnClickListener {
            Glide.with(this).load(getString(R.string.ramires_image)).into(
                binding.imageViewIcon
            )
        }
        binding.buttonMessi.setOnClickListener {
            Glide.with(this).load(getString(R.string.messi_image)).into(
                binding.imageViewIcon
            )
        }
    }
}