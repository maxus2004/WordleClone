package com.example.wordleclone;

public class WordsDatabase {

    public boolean isWord(String theme, String word) {
        for (String s : words) {
            if (word.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public String getRandomWord(String theme, int wordLength) {
        int id = (int) (Math.random() * words.length);
        return words[id];
    }

    String[] words = {
            "книга",
            "аврал",
            "азарт",
            "акула",
            "алмаз",
            "огонь",
            "аркан",
            "атлас",
            "ведро",
            "весна",
            "ветер",
            "трава",
            "ермак",
            "жизнь",
            "замок",
            "икона",
            "икота",
            "ирина",
            "искра",
            "кокос",
            "комар",
            "кошка",
            "крона",
            "лиана",
            "мадам",
            "мороз",
            "обида",
            "озеро",
            "океан",
            "олово",
            "ольга",
            "опера",
            "осада",
            "отара",
            "охота",
            "страх",
            "ребро",
            "роман",
            "свеча",
            "скука",
            "слава",
            "слово",
            "сокол",
            "табак",
            "такса",
            "таран",
            "титан",
            "топор",
            "трико",
            "тропа",
            "труба",
            "тыква",
            "укроп",
            "хвост",
            "алиби",
            "атака",
            "волга",
            "канал",
            "оскал",
            "оскар",
            "радио",
            "ретро",
            "рукав",
            "такси",
            "театр",
            "ягуар",
            "алиса",
            "елена",
            "индия",
            "раиса",
            "вицин",
            "игорь",
            "китай",
            "абрам",
            "днепр",
            "конец",
            "автор",
            "агент",
            "ангел",
            "арена",
            "крест",
            "время",
            "гамак",
            "голод",
            "гусар",
            "диван",
            "драка",
            "дурак",
            "дятел",
            "земля",
            "ислам",
            "какао",
            "канат",
            "карта",
            "кукла",
            "ладан",
            "масло",
            "народ",
            "наука",
            "номер",
            "оазис",
            "опала",
            "орава",
            "орган",
            "осень",
            "осина",
            "павел",
            "парад",
            "ртуть",
            "салат",
            "сахар",
            "свита",
            "скрип",
            "стадо",
            "тавро",
            "товар",
            "тулуп",
            "умора",
            "школа",
            "якорь",
            "аванс",
            "адрес",
            "актёр",
            "ангар",
            "анонс",
            "аскет",
            "астат",
            "астра",
            "диана",
            "егоза",
            "игрок",
            "идиот",
            "клоун",
            "лапти",
            "лотос",
            "насос",
            "нитка",
            "окапи",
            "побег",
            "попов",
            "радар",
            "робот",
            "клара",
            "борис",
            "быков",
            "орлов",
            "ленин",
            "токио",
            "дунай",
            "исаак",
            "вадим",
            "альфа",
            "антре",
            "армия",
            "аспид",
            "базар",
            "веник",
            "война",
            "ворон",
            "гарем",
            "лодка",
            "голос",
            "горло",
            "диета",
            "евнух",
            "ересь",
            "есаул",
            "зебра",
            "исток",
            "казак",
            "карат",
            "касса",
            "катар",
            "короб",
            "котел",
            "кровь",
            "кулак",
            "лампа",
            "ложка",
            "макар",
            "марка",
            "набат",
            "олень",
            "опора",
            "осетр",
            "потоп",
            "сетка",
            "стена",
            "столб",
            "талия",
            "твист",
            "терем",
            "тесто",
            "уксус",
            "улика",
            "шакал",
            "скотт",
            "ампир",
            "аргон",
            "давид",
            "драже",
            "емеля",
            "идеал",
            "интим",
            "каток",
            "налог",
            "нанду",
            "порше",
            "ралли",
            "рокер",
            "ромео",
            "рыбак",
            "спорт",
            "спуск",
            "удача",
            "устав",
            "устье",
            "франк",
            "артур",
            "иоанн",
            "минск",
            "остап",
            "париж",
            "алеко",
            "арака",
            "барак",
            "водка",
            "конго",
            "апорт",
            "арбуз",
            "атолл",
            "афера",
            "дверь",
            "дождь",
            "жираф",
            "инжир",
            "кабак",
            "класс",
            "кобра",
            "крыло",
            "ласка",
            "лента",
            "место",
            "метла",
            "овраг",
            "оникс",
            "опека",
            "пегас",
            "пение",
            "поиск",
            "проба",
            "спирт",
            "текст",
            "титул",
            "тракт",
            "шкода",
            "шкура",
            "шпага",
            "ягода",
            "кагор",
            "агора",
            "амбал",
            "вилка",
            "звено",
            "камаз",
            "карло",
            "лидер",
            "лилия",
            "накал",
            "наряд",
            "нонет",
            "озноб",
            "октет",
            "олимп",
            "отказ",
            "отряд",
            "петух",
            "повар",
            "регби",
            "репка",
            "рикша",
            "ропот",
            "ротор",
            "совет",
            "сплав",
            "табло",
            "тайна",
            "томат",
            "тотем",
            "удила",
            "мария",
            "стоун",
            "антон",
            "федор",
            "афины",
            "львов",
            "браун",
            "непал",
            "аккра",
            "иосиф",
            "норов",
            "аббат",
            "абрек",
            "амбар",
            "арест",
            "афиша",
            "блоха",
            "брага",
            "вальс",
            "венок",
            "весло",
            "гвалт",
            "грант",
            "десна",
            "добро",
            "дрова",
            "индюк",
            "киоск",
            "кокон",
            "кража",
            "лапша",
            "лимон",
            "маска",
            "налим",
            "орало",
            "орион",
            "паром",
            "пауза",
            "разум",
            "рента",
            "рычаг",
            "сапог",
            "сосна",
            "спина",
            "ссора",
            "стопа",
            "сукно",
            "туман",
            "шляпа",
            "штамп",
            "экран",
            "амати",
            "браво",
            "виски",
            "горка",
            "джинн",
            "динар",
            "колье",
            "лассо",
            "маляр",
            "манул",
            "обвал",
            "птица",
            "рабат",
            "ритор",
            "ролик",
            "сатир",
            "сдача",
            "склад",
            "смысл",
            "старт",
            "танец",
            "тимур",
            "ткань",
            "ухват",
            "адамс",
            "апарт",
            "гарин",
            "литва",
            "ришар",
            "томас",
            "разин",
            "огайо",
            "дакар",
            "прага",
            "баран",
            "агава",
            "банан",
            "бокал",
            "вечер",
            "врата",
            "горох",
            "драма",
            "дупло",
            "кадет",
            "калач",
            "капот",
            "кизил",
            "ковер",
            "лабаз",
            "лунка",
            "норма",
            "омела",
            "онагр",
            "осока",
            "отпор",
            "парус",
            "салон",
            "сироп",
            "скала",
            "скоба",
            "сосуд",
            "ствол",
            "сутки",
            "тиран",
            "торба",
            "узник",
            "улица",
            "факел",
            "центр",
            "архив",
            "актив",
            "бланк",
            "дартс",
            "диско",
            "донос",
            "жажда",
            "загар",
            "запас",
            "иваси",
            "клише",
            "козёл",
            "кросс",
            "марго",
            "метро",
            "мопед",
            "нимфа",
            "носик",
            "образ",
            "оклад",
            "ореол",
            "ответ",
            "пенал",
            "право",
            "пьеро",
            "рвань",
            "родео",
            "ряска",
            "свист",
            "седло",
            "транс",
            "шоссе",
            "ильин",
            "исаев",
            "кваша",
            "варум",
            "алжир",
            "адлер",
            "садко",
            "тарас",
            "авизо",
            "банка",
            "билет",
            "бочка",
            "букет",
            "вакса",
            "виола",
            "волна",
            "галоп",
            "глина",
            "доска",
            "досуг",
            "егерь",
            "закон",
            "орден",
            "кабан",
            "кадка",
            "калым",
            "камин",
            "канон",
            "купер",
            "ливан",
            "мираж",
            "молот",
            "опрос",
            "порог",
            "пункт",
            "рондо",
            "рубин",
            "ружье",
            "свора",
            "скопа",
            "спрос",
            "среда",
            "сталь",
            "тенор",
            "толпа",
            "тоска",
            "точка",
            "уголь",
            "фокус",
            "фронт",
            "шпион",
            "шпора",
            "юнона",
            "артем",
            "аудит",
            "варан",
            "ежиха",
            "ерник",
            "закат",
            "игрек",
            "кивок",
            "кредо",
            "обзор",
            "отвар",
            "откат",
            "отсев",
            "песня",
            "пикап",
            "пожар",
            "раунд",
            "салют",
            "смена",
            "тираж",
            "турне",
            "хиппи",
            "шайба",
            "яство",
            "чехов",
            "альпы",
            "артек",
            "итака",
            "яунде",
            "старр",
            "алтын",
            "арина",
            "ванна",
            "вдова",
            "грива",
            "зенит",
            "кирка",
            "колос",
            "купол",
            "линия",
            "олифа",
            "пакет",
            "песок",
            "пятак",
            "пятка",
            "русло",
            "рынок",
            "рюмка",
            "слеза",
            "смола",
            "содом",
            "степь",
            "табор",
            "табун",
            "тиара",
            "холст",
            "череп",
            "шаман",
            "шторм",
            "аверс",
            "алкаш",
            "альба",
            "вишну",
            "генри",
            "давка",
            "донор",
            "забор",
            "клака",
            "мечта",
            "монах",
            "набор",
            "навар",
            "навес",
            "наказ",
            "носок",
            "нытик",
            "обман",
            "обыск",
            "опара",
            "особа",
            "пекло",
            "радон",
            "рожок",
            "скаут",
            "собор",
            "татра",
            "тенге",
            "уклон",
            "умник",
            "хокку",
            "шасси",
            "ямщик",
            "аллен",
            "маркс",
            "анапа",
            "холмс",
            "титов",
            "алекс",
            "остин",
            "обама",
            "дания",
            "кения",
            "нигер",
            "акела",
            "бруно"
    };
}
