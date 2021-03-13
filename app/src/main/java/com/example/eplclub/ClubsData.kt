package com.example.eplclub

object ClubsData {

    private val clubNames = arrayOf(
        "Arsenal",
        "Aston Villa",
        "Brighton & Hove Albion",
        "Burnley",
        "Chelsea",
        "Crystal Palace",
        "Everton",
        "Fulham",
        "Leeds United",
        "Leicester City",
        "Liverpool",
        "Manchester City",
        "Manchester United",
        "Newcaslte United",
        "Sheffield United",
        "Southampton",
        "Tottenham Hotspur",
        "West Bromwich Albion",
        "West Ham United",
        "Wolverhampton Wanderers"
    )

    private val clubManagers = arrayOf(
        "Mikel Arteta",
        "Dean Smith",
        "Graham Potter",
        "Sean Dyche",
        "Thomas Tuchel",
        "Roy Hodgson",
        "Carlo Ancelotti",
        "Scott Parker",
        "Marcelo Bielsa",
        "Brendan Rodgers",
        "Jürgen Klopp",
        "Pep Guardiola",
        "Ole Gunnar Solskjær",
        "Steve Bruce",
        "Chris Wilder",
        "Ralph Hasenhüttl",
        "José Mourinho",
        "Sam Allardyce",
        "David Moyes",
        "Nuno Espírito Santo"

    )

    private val clubNicknames = arrayOf(
        "The Gunners",
        "The Villa",
        "The Seagulls",
        "The Clarets",
        "The Blues",
        "The Eagles",
        "The Toffees",
        "The Cottagers",
        "The Peacocks",
        "The Foxes",
        "The Reds",
        "The Citizens",
        "The Red Devils",
        "The Magpies",
        "The Blades",
        "The Saints",
        "The Lilywhites",
        "The Baggies",
        "The Hammers",
        "The Wanderers"

    )

    private val clubStadiums = arrayOf(
        "Emirates Stadium",
        "Villa Park",
        "American Express Community Stadium",
        "Turf Moor",
        "Stamford Bridge",
        "Selhurst Park Stadium",
        "Goodison Park",
        "Craven Cottage",
        "Elland Road",
        "King Power Stadium",
        "Anfield",
        "Etihad Stadium",
        "Old Trafford",
        "St James' Park",
        "Bramall Lane",
        "St Mary's Stadium",
        "Tottenham Hotspur Stadium",
        "The Hawthorns",
        "London Stadium",
        "Molineux Stadium"

    )

    private val clubLocations = arrayOf(
        "London Borough of Islington, London, United Kingdom",
        "Aston, Birmingham, United Kingdom",
        "Brighton and Hove, United Kingdom",
        "Burnley, United Kingdom",
        "Chelsea, London, United Kingdom",
        "London, United Kingdom",
        "Liverpool, United Kingdom",
        "Fulham, London, United Kingdom",
        " Leeds, West Yorkshire, United Kingdom",
        "Leicester, East Midlands, United Kingdom",
        "Liverpool, United Kingdom",
        "Manchester, United Kingdom",
        "Manchester, United Kingdom",
        "Newcastle upon Tyne, Tyne and Wear, United Kingdom",
        "Sheffield, United Kingdom",
        "Southampton, United Kingdom",
        "Tottenham, London, United Kingdom",
        "West Bromwich, United Kingdom",
        "Stratford, United Kingdom",
        "Wolverhampton, United Kingdom"

    )

    private val clubOwners = arrayOf(
        "Kroenke Sports & Entertainment",
        "Nassef Sawiris, Wes Edens",
        "Tony Bloom",
        "Alan Pace",
        "Roman Abramovich",
        "Steve Parish, Josh Harris, David S. Blitzer",
        "Farhad Moshiri",
        "Shahid Khan",
        "Aser Group Holding & 49ers Enterprises",
        "King Power",
        "Fenway Sports Group",
        "City Football Group",
        "Manchester United (NYSE: MANU)",
        "Mike Ashley",
        "Abdullah bin Musa'ad bin Abdulaziz Al Saud",
        "Jisheng Gao",
        "ENIC Group",
        "Lai Guochuan",
        "David Sullivan, David Gold, Albert 'Tripp' Smith",
        "Fosun International"

    )

    private val clubDetails = arrayOf(
        "The Arsenal Football Club is a professional football club based in Islington, London, England that plays in the Premier League, the top flight of English football.",
        "Aston Villa Football Club is an English professional football club based in Aston, Birmingham. The club competes in the Premier League, the top tier of the English football league system. Founded in 1874, they have played at their home ground, Villa Park, since 1897.",
        "Brighton & Hove Albion Football Club, commonly referred to simply as Brighton, is an English professional football club based in the city of Brighton and Hove. They compete in the Premier League, the top tier of the English football league system.",
        "Burnley Football Club is an English association football club based in Burnley, Lancashire. Founded on 18 May 1882, it was one of the first to become professional, and subsequently put pressure on the Football Association to permit payments to players.",
        "Chelsea Football Club is an English professional football club based in Fulham, London. Founded in 1905, the club competes in the Premier League, the top division of English football.",
        "Crystal Palace Football Club is a professional football club based in Selhurst, South London, England, who currently compete in the Premier League, the highest level of English football.",
        "Everton Football Club is an English professional football club based in Liverpool that competes in the Premier League, the top tier of English football.",
        "Fulham Football Club is an English professional association football club based in Fulham, London. They currently compete in the Premier League, the highest level of the English football league system. Founded in 1879, they are London's oldest football club playing professionally.",
        "Leeds United Football Club is an English professional football club based in the city of Leeds, West Yorkshire. The club was formed in 1919 following the disbanding of Leeds City by the Football League and took over their Elland Road stadium.",
        "Leicester City Football Club is a professional football club based in Leicester in the East Midlands, England. The club competes in the Premier League, the top division of England's football league system, and plays its home matches at the King Power Stadium.",
        "Liverpool Football Club is a professional football club in Liverpool, England, that competes in the Premier League, the top tier of English football. Domestically, the club has won nineteen League titles, seven FA Cups, a record eight League Cups and fifteen FA Community Shields.",
        "Manchester City Football Club is an English football club based in Manchester that competes in the Premier League, the top flight of English football. Founded in 1880 as St. Mark's, it became Ardwick Association Football Club in 1887 and Manchester City in 1894.",
        "Manchester United Football Club is a professional football club based in Old Trafford, Greater Manchester, England, that competes in the Premier League, the top flight of English football.",
        "Newcastle United Football Club is an English professional football club based in Newcastle upon Tyne, Tyne and Wear, that plays in the Premier League, the top flight of English football. Founded in 1892 by the merger of Newcastle East End and Newcastle West End. The team plays its home matches at St. James' Park.",
        "Sheffield United Football Club is a professional football club in Sheffield, South Yorkshire, England, which competes in the Premier League, the top division of English football.",
        "Southampton Football Club is an English professional football club based in Southampton, Hampshire, which plays in the Premier League, the top tier of English football.",
        "Tottenham Hotspur Football Club, commonly referred to as Tottenham or Spurs, is an English professional football club in Tottenham, London, that competes in the Premier League.",
        "West Bromwich Albion Football Club is an English professional football club based in West Bromwich, West Midlands, England, that competes in the Premier League, the top tier of English football. The club was formed in 1878 and has played at its home ground, The Hawthorns, since 1900.",
        "West Ham United Football Club is an English professional football club based in Stratford, East London, England, that compete in the Premier League, the top tier of English football. The club plays at the London Stadium, having moved from their former home, the Boleyn Ground, in 2016.",
        "Wolverhampton Wanderers Football Club, commonly known as Wolves, is a professional association football club based in the city of Wolverhampton in the West Midlands, England."

    )

    private val clubSquads = arrayOf(
            "Alves Soares, Cedric Ricardo    \n" +
                    "Aubameyang, Pierre-Emerick    \n" +
                    "Bellerin, Hector*\n" +
                    "Borges Da Silva, Willian    \n" +
                    "Ceballos Fernandez, Daniel    \n" +
                    "Chambers, Calum*\n" +
                    "Dos Santos Magalhães, Gabriel    \n" +
                    "Elneny, Mohamed Naser Elsayed    \n" +
                    "Holding, Robert Samuel*\n" +
                    "Iliev, Deyan*\n" +
                    "Lacazette, Alexandre    \n" +
                    "Leno, Bernd    \n" +
                    "Mari Villar, Pablo    \n" +
                    "Moreira Marinho, David Luiz    \n" +
                    "Odegaard, Martin    \n" +
                    "Partey, Thomas Teye    \n" +
                    "Pepe, Nicolas    \n" +
                    "Runarsson, Runar Alex    \n" +
                    "Ryan, Mathew David    \n" +
                    "Tierney, Kieran    \n" +
                    "Xhaka, Granit   ",
            "Barkley, Ross*\n" +
                    "Cash, Matthew Stuart*\n" +
                    "Davis, Keinan Vincent Joseph*\n" +
                    "Eissa, Ahmed Elmohamady Abdelfattah Aly    \n" +
                    "El Ghazi, Anwar    \n" +
                    "Engels, Bjorn Lionel G.    \n" +
                    "Grealish, Jack*\n" +
                    "Hassan, Mahmoud Ahmed Ibrahim    \n" +
                    "Hause, Kortney Paul Duncan*\n" +
                    "Heaton, Thomas David*\n" +
                    "Konsa, Ezri Ngoyo*\n" +
                    "Martinez Romero, Damian Emiliano*\n" +
                    "McGinn, John    \n" +
                    "Mings, Tyrone Deon*\n" +
                    "Moraes Ferreira Da Silva, Wesley    \n" +
                    "Nakamba, Marvelous    \n" +
                    "Sanson, Morgan Stephane    \n" +
                    "Soares De Paulo, Douglas Luiz    \n" +
                    "Steer, Jed John*\n" +
                    "Targett, Matthew Robert*\n" +
                    "Taylor, Neil John*\n" +
                    "Traore, Bertrand Isidore    \n" +
                    "Watkins, Oliver George Arthur*",
            "Alzate, Steven*\n" +
                    "Andone, Florin    \n" +
                    "Bissouma, Yves    \n" +
                    "Burn, Daniel Johnson*\n" +
                    "Crofts, Andrew Lawrence*\n" +
                    "Dunk, Lewis Carl*\n" +
                    "Gross, Pascal    \n" +
                    "Izquierdo Mena, Jose Heriberto    \n" +
                    "Jahan Bakhsh Jirandeh, Alireza    \n" +
                    "Lallana, Adam David*\n" +
                    "Lynch Sanchez, Robert*\n" +
                    "Mac Allister, Alexis    \n" +
                    "March, Soloman Benjamin*\n" +
                    "Maupay, Neal    \n" +
                    "Propper, David Petrus Wenceslaus Henri    \n" +
                    "Steele, Jason Sean*\n" +
                    "Tau, Percy Muzi    \n" +
                    "Trossard, Leandro    \n" +
                    "Veltman, Joel Ivo    \n" +
                    "Walton, Christian Timothy*\n" +
                    "Webster, Adam Harry*\n" +
                    "Welbeck, Daniel*\n" +
                    "White, Benjamin William*",
            "Bardsley, Phillip Anthony*\n" +
                    "Barnes, Ashley Luke*\n" +
                    "Brady, Robert*\n" +
                    "Brownhill, Joshua*\n" +
                    "Cork, Jack Frank Porteous*\n" +
                    "Dunne, James*\n" +
                    "Gudmundsson, Johann Berg    \n" +
                    "Long, Kevin Finbarr*\n" +
                    "Lowton, Matthew John*\n" +
                    "Mee, Benjamin Thomas*\n" +
                    "Nartey, Richard Nicos Tettey*\n" +
                    "Norris, William James*\n" +
                    "Peacock-Farrell, Bailey*\n" +
                    "Pieters, Erik    \n" +
                    "Pope, Nicholas David*\n" +
                    "Rodriguez, Jay Enrique*\n" +
                    "Stephens, Dale Christopher*\n" +
                    "Tarkowski, James Alan*\n" +
                    "Taylor, Charles James*\n" +
                    "Vydra, Matej    \n" +
                    "Westwood, Ashley Roy*\n" +
                    "Wood, Chris*",
            "Abraham, Tammy*\n" +
                    "Alonso Mendoza, Marcos    \n" +
                    "Arrizabalaga Revuelta, Kepa    \n" +
                    "Azpilicueta Tanco, Cesar    \n" +
                    "Caballero Lazcano, Wilfredo Daniel    \n" +
                    "Cech, Petr    \n" +
                    "Chilwell, Benjamin James*\n" +
                    "Christensen, Andreas Bodtker*\n" +
                    "Emiliano Da Silva, Thiago    \n" +
                    "Giroud, Olivier    \n" +
                    "Jorge Luiz, Frello Filho    \n" +
                    "Kante, Ngolo    \n" +
                    "Kovacic, Mateo    \n" +
                    "Mendy, Edouard Osoque    \n" +
                    "Palmieri Dos Santos, Emerson    \n" +
                    "Pulisic, Christian Mate    \n" +
                    "Rudiger, Antonio    \n" +
                    "Werner, Timo    \n" +
                    "Ziyech, Hakim    \n" +
                    "Zouma, Kurt Happy",
            "Ayew, Jordan Pierre    \n" +
                    "Batshuayi, Michy    \n" +
                    "Benteke, Christian    \n" +
                    "Butland, Jack*\n" +
                    "Cahill, Gary James*\n" +
                    "Clyne, Nathaniel Edwin*\n" +
                    "Dann, Scott*\n" +
                    "Eze, Eberechi Oluchi*\n" +
                    "Guaita, Vicente    \n" +
                    "Hennessey, Wayne Robert*\n" +
                    "Kelly, Martin Ronald*\n" +
                    "Kouyate, Cheikhou    \n" +
                    "Mateta, Jean-Philippe    \n" +
                    "McArthur, James    \n" +
                    "McCarthy, James Patrick*\n" +
                    "Milivojevic, Luka    \n" +
                    "Riedewald, Jairo Jocquim    \n" +
                    "Sakho, Mamadou    \n" +
                    "Schlupp, Jeffrey*\n" +
                    "Tomkins, James Oliver Charles*\n" +
                    "Townsend, Andros*\n" +
                    "Van Aanholt, Patrick John Miguel*\n" +
                    "Ward, Joel Edward Philip*\n" +
                    "Wickham, Connor Neil Ralph*\n" +
                    "Zaha, Dazet Wilfried Armel*",
            "Anicio Caldeira Duarte, Bernard    \n" +
                    "Besic, Muhamed    \n" +
                    "Broadhead, Nathan Paul*\n" +
                    "Calvert-Lewin, Dominic*\n" +
                    "Coleman, Seamus    \n" +
                    "Davies, Thomas*\n" +
                    "De Andrade, Richarlison    \n" +
                    "Delph, Fabian*\n" +
                    "Digne, Lucas    \n" +
                    "Doucoure, Abdoulaye    \n" +
                    "Gbamin, Jean-Philippe    \n" +
                    "Godfrey, Benjamin Matthew*\n" +
                    "Holgate, Mason Anthony*\n" +
                    "Iwobi, Alex*\n" +
                    "Keane, Michael Vincent*\n" +
                    "King, Joshua Christian Kojo*\n" +
                    "Marques Loureiro, Allan    \n" +
                    "Mina Gonzalez, Yerry Fernando    \n" +
                    "Olsen, Robin Patrick    \n" +
                    "Pickford, Jordan Lee*\n" +
                    "Rodriguez Rubio, James David    \n" +
                    "Sigurdsson, Gylfi Thor*\n" +
                    "Tavares Gomes, Andre Filipe",
            "Adarabioyo, Abdul-Nasir Oluwatosin*\n" +
                    "Aina, Temitayo Olufisayo Olaoluwa*\n" +
                    "Andersen, Joachim Christian     \n" +
                    "Areola, Alphonse     \n" +
                    "Bryan, Joseph Edward*\n" +
                    "Cairney, Thomas*\n" +
                    "Hector, Michael Anthony James*\n" +
                    "Kongolo, Terence     \n" +
                    "Lemina, Mario Rene Junior    \n" +
                    "Loftus Cheek, Ruben*\n" +
                    "Lookman, Ademola*\n" +
                    "Maja, Joshua Erowoli*\n" +
                    "Mitrovic, Aleksandar    \n" +
                    "Neves Abreu Cavaleiro, Ivan Ricardo    \n" +
                    "Odoi, Denis Frimpong    \n" +
                    "Onomah, Joshua *\n" +
                    "Ramirez, Fabricio Agosto    \n" +
                    "Ream, Timothy Michael    \n" +
                    "Reed, Harrison James*\n" +
                    "Reid, Bobby Armani*\n" +
                    "Robinson, Antonee*\n" +
                    "Rodak, Marek*\n" +
                    "Tete, Kenny Joelle    \n" +
                    "Zambo Anguissa, Andre-Frank",
            "Alioski, Ezgjan    \n" +
                    "Ayling, Luke David*\n" +
                    "Bamford, Patrick James*\n" +
                    "Berardi, Gaetano Michel    \n" +
                    "Casilla Cortes, Francisco    \n" +
                    "Cooper, Liam David Ian*\n" +
                    "Dallas, Stuart    \n" +
                    "Dias Belloli, Raphael    \n" +
                    "Forshaw, Adam John*\n" +
                    "Harrison, Jack*\n" +
                    "Hernandez Dominguez, Pablo    \n" +
                    "Klich, Mateusz Andrzej    \n" +
                    "Koch, Robin    \n" +
                    "Llorente Rios, Diego Javier    \n" +
                    "Moreno Machado, Rodrigo    \n" +
                    "Phillips, Kalvin Mark*\n" +
                    "Sousa De Azevedo E Costa, Helder Wander",
            "Albrighton, Marc Kevin*\n" +
                    "Amartey, Daniel    \n" +
                    "Barnes, Harvey Lewis*\n" +
                    "Castagne, Timothy    \n" +
                    "Choudhury, Hamza*\n" +
                    "Evans, Jonathan Grant*\n" +
                    "Fuchs, Christian    \n" +
                    "Iheanacho, Kelechi*\n" +
                    "Jakupovic, Eldin    \n" +
                    "Justin, James Michael*\n" +
                    "Maddison, James Daniel*\n" +
                    "Mendy, Nampalys    \n" +
                    "Morgan, Westley Nathan*\n" +
                    "Ndidi, Onyinye Wilfred    \n" +
                    "Pereira, Ricardo    \n" +
                    "Perez Gutierrez, Ayoze    \n" +
                    "Praet, Dennis    \n" +
                    "Schmeichel, Kasper Peter*\n" +
                    "Soyuncu, Caglar    \n" +
                    "Tielemans, Youri Marion A    \n" +
                    "Under, Cengiz    \n" +
                    "Vardy, Jamie*\n" +
                    "Ward, Daniel*",
            "Alcantara Do Nascimento, Thiago    \n" +
                    "Alexander Arnold, Trent*\n" +
                    "Barbosa De Oliveira, Roberto Firmino    \n" +
                    "Becker, Alisson Ramses    \n" +
                    "Davies, Benjamin Keith*\n" +
                    "Gomez, Joseph David*\n" +
                    "Hardy, Joseph*\n" +
                    "Henderson, Jordan Brian*\n" +
                    "Henrique Taveres, Fabio    \n" +
                    "Keita, Naby    \n" +
                    "Kelleher, Caoimhin*\n" +
                    "Mane, Sadio    \n" +
                    "Matip, Job Joel Andre    \n" +
                    "Milner, James Philip*\n" +
                    "Origi, Divock Okoth    \n" +
                    "Oxlade-Chamberlain, Alexander Mark David*\n" +
                    "Phillips, Nathaniel Harry*\n" +
                    "Robertson, Andrew    \n" +
                    "Salah, Mohamed    \n" +
                    "San Miguel Del Castillo, Adrian    \n" +
                    "Shaqiri, Xherdan    \n" +
                    "Teixeira Da Silva, Diogo Jose    \n" +
                    "Tsimakis, Konstantinos    \n" +
                    "Van Dijk, Virgil    \n" +
                    "Wijnaldum, Georginio",
            "Aguero Del Castillo, Sergio    \n" +
                    "Ake, Nathan Benjamin*\n" +
                    "Carson, Scott Paul*\n" +
                    "Cavaco Cancelo, Joao Pedro    \n" +
                    "De Bruyne, Kevin    \n" +
                    "Dos Santos Gato Alves Dias, Ruben    \n" +
                    "Fernando De Jesus, Gabriel    \n" +
                    "Gundogan, Ilkay    \n" +
                    "Hernandez Cascante, Rodrigo    \n" +
                    "Laporte, Aymeric Jean Louis Gerard Alphonse    \n" +
                    "Luiz Roza, Fernando    \n" +
                    "Mahrez, Riyad    \n" +
                    "Mendy, Benjamin    \n" +
                    "Mota Veiga De Carvalho E Silva, Bernardo    \n" +
                    "Sandler, Philippe    \n" +
                    "Santana de Moraes, Ederson    \n" +
                    "Steffen, Zackary Thomas    \n" +
                    "Sterling, Raheem Shaquille*\n" +
                    "Stones, John*\n" +
                    "Walker, Kyle Andrew*\n" +
                    "Zinchenko, Oleksandr",
            "Bailly, Eric Bertrand    \n" +
                    "Borges Fernandes, Bruno Miguel    \n" +
                    "Cavani, Edinson Roberto    \n" +
                    "De Gea Quintana, David    \n" +
                    "Grant, Lee Anderson*\n" +
                    "Henderson, Dean Bradley*\n" +
                    "James, Daniel Owen*\n" +
                    "Jones, Philip Anthony*\n" +
                    "Lindelof, Victor Jorgen Nilsson    \n" +
                    "Maguire, Jacob Harry*\n" +
                    "Martial, Anthony Jordan    \n" +
                    "Mata Garcia, Juan Manuel    \n" +
                    "Matic, Nemanja    \n" +
                    "McTominay, Scott*\n" +
                    "Nicolao Telles, Alex    \n" +
                    "Pogba, Paul Labile*\n" +
                    "Rashford, Marcus*\n" +
                    "Romero, Sergio German    \n" +
                    "Santos, Frederico Rodrigues De Paula    \n" +
                    "Shaw, Luke Paul Hoare*\n" +
                    "Tuanzebe, Axel*\n" +
                    "Van De Beek, Donny    \n" +
                    "Wan-Bissaka, Aaron*",
            "Almiron Rejala, Miguel Angel    \n" +
                    "Apolinario De Lira, Joelinton Cassio    \n" +
                    "Carroll, Andrew Thomas*\n" +
                    "Clark, Ciaran*\n" +
                    "Darlow, Karl*\n" +
                    "Dubravka, Martin    \n" +
                    "Dummett, Paul*\n" +
                    "Fernandez, Federico    \n" +
                    "Fraser, Ryan    \n" +
                    "Gayle, Dwight Devon Boyd*\n" +
                    "Gillespie, Mark Joseph*\n" +
                    "Hayden, Isaac Scot*\n" +
                    "Hendrick, Jeffrey*\n" +
                    "Kraft, Emil Henry Kristoffer    \n" +
                    "Lascelles, Jamaal*\n" +
                    "Lewis, Jamal*\n" +
                    "Longstaff, Sean David*\n" +
                    "Manquillo Gaitan, Javier    \n" +
                    "Murphy, Jacob Kai*\n" +
                    "Ritchie, Matthew Thomas*\n" +
                    "Saint Maximin, Allan Irenee    \n" +
                    "Schar, Fabian Lukas    \n" +
                    "Shelvey, Jonjo*\n" +
                    "Twasam, Christian Atsu    \n" +
                    "Wilson, Callum Eddie Graham*",
            "Baldock, George Henry Ivor*\n" +
                    "Basham, Christopher Paul*\n" +
                    "Berge, Sander Gard Bolin    \n" +
                    "Bryan, Kean Shay*\n" +
                    "Burke, Oliver*\n" +
                    "Egan, John*\n" +
                    "Fleck, John Alexander    \n" +
                    "Foderingham, Wesley Andrew*\n" +
                    "Jagielka, Philip Nikodem*\n" +
                    "Lowe, Max Josef*\n" +
                    "Lundstram, John David*\n" +
                    "McBurnie, Oliver*\n" +
                    "McGoldrick, David James*\n" +
                    "Moore, Simon William*\n" +
                    "Mousset, Lys Emilien    \n" +
                    "Norwood, Oliver James*\n" +
                    "O'Connell, Jack William*\n" +
                    "Osborn, Benjamin Jarrod*\n" +
                    "Ramsdale, Aaron*\n" +
                    "Robinson, Jack*\n" +
                    "Rodwell, Jack Christian*\n" +
                    "Sharp, Billy Louis*\n" +
                    "Stevens, Enda",
            "Adams, Che Sac Everton Fred*\n" +
                    "Armstrong, Stuart    \n" +
                    "Bednarek, Jan    \n" +
                    "Bertrand, Ryan*\n" +
                    "Djenepo, Moussa    \n" +
                    "Forster, Fraser Gerard*\n" +
                    "Ings, Daniel William John*\n" +
                    "Latham, Kingsley Finn*\n" +
                    "Lewis, Harry Charles John*\n" +
                    "Long, Shane Patrick*\n" +
                    "McCarthy, Alex Simon*\n" +
                    "McQueen, Samuel James*\n" +
                    "Minamino, Takumi    \n" +
                    "Redmond, Nathan Daniel Jerome*\n" +
                    "Stephens, Jack*\n" +
                    "Vestergaard, Jannik    \n" +
                    "Vidal, Oriol Romeu    \n" +
                    "Walcott, Theo James*\n" +
                    "Walker-Peters, Kyle Leonardus*\n" +
                    "Ward-Prowse, James Michael Edward*",
            "Alderweireld, Toby Albertine    \n" +
                    "Alli, Bamidele Jermaine*\n" +
                    "Alves Morais, Carlos Vinicius    \n" +
                    "Aurier, Serge    \n" +
                    "Bale, Gareth Frank*\n" +
                    "Bergwijn, Steven Charles    \n" +
                    "Davies, Benjamin Thomas*\n" +
                    "Dier, Eric Jeremy Edgar    \n" +
                    "Doherty, Matthew James*\n" +
                    "Hart, Charles Joseph John*\n" +
                    "Heung-Min, Son    \n" +
                    "Højbjerg, Pierre Emile Kordt    \n" +
                    "Kane, Harry*\n" +
                    "Lamela, Erik    \n" +
                    "Lloris, Hugo    \n" +
                    "Lo Celso, Giovani    \n" +
                    "Ndombele Alvaro, Tanguy    \n" +
                    "Reguilon Rodriguez, Sergio    \n" +
                    "Rodon, Joseph Peter*\n" +
                    "Rodrigues Moura Da Silva, Lucas    \n" +
                    "Sanchez Mina, Davinson    \n" +
                    "Sissoko, Moussa    \n" +
                    "Whiteman, Alfie Malik*\n" +
                    "Winks, Harry*",
            "Ahearne-Grant, Karlan Laughton*\n" +
                    "Ajayi, Oluwasemilogo Adesewo*\n" +
                    "Bartley, Kyle*\n" +
                    "Button, David*\n" +
                    "Diagne, Mbaye    \n" +
                    "Diangana, Grady George*\n" +
                    "Edwards, Kyle Hakeem*\n" +
                    "Furlong, Darnell Anthony*\n" +
                    "Gibbs, Kieran James Ricardo*\n" +
                    "Grosicki, Kamil Pawel    \n" +
                    "Ivanovic, Branislav    \n" +
                    "Johnstone, Samuel Luke*\n" +
                    "Livermore, Jake Cyril*\n" +
                    "Lonergan, Andrew Michael*\n" +
                    "Maitland-Niles, Ainsley*\n" +
                    "Peltier, Lee*\n" +
                    "Pereira, Matheus Fellipe Costa    \n" +
                    "Phillips, Matthew*\n" +
                    "Robinson, Callum Jack*\n" +
                    "Robson-Kanu, Thomas Hal*\n" +
                    "Sawyers, Romaine*\n" +
                    "Snodgrass, Robert    \n" +
                    "Townsend, Conor Stephen*\n" +
                    "Yokuslu, Okay",
            "Antonio, Michail Gregory*\n" +
                    "Balbuena Gonzalez, Fabian Cornelio    \n" +
                    "Benrahma, Mohamed Said    \n" +
                    "Bowen, Jarrod*\n" +
                    "Coufal, Vladimir    \n" +
                    "Cresswell, Aaron William*\n" +
                    "Dawson, Craig*\n" +
                    "Diop, Issa Laye Lucas Jean    \n" +
                    "Fabianski, Lukasz    \n" +
                    "Fornals Malla, Pablo    \n" +
                    "Fredericks, Ryan*\n" +
                    "Holland, Nathan Elliot*\n" +
                    "Lanzini, Manuel    \n" +
                    "Lingard, Jesse Ellis*\n" +
                    "Martin, David Edward*\n" +
                    "Masuaku Kawela, Fuka-Arthur    \n" +
                    "Noble, Mark James*\n" +
                    "Ogbonna, Obinze Angelo    \n" +
                    "Randolph, Darren*\n" +
                    "Soucek, Tomas    \n" +
                    "Trott, Nathan Wallace Newman*\n" +
                    "Yarmolenko, Andrii    ",
            "Boly, Willy-Arnaud Zobo    \n" +
                    "Cabral Semedo, Nelson    \n" +
                    "Castelo Podence, Daniel    \n" +
                    "Castro Otto, Jonatan    \n" +
                    "Coady, Conor David*\n" +
                    "Da Silva, Willian Jose    \n" +
                    "Da Silva Neves, Ruben Diogo    \n" +
                    "Dendoncker, Leander    \n" +
                    "Dos Santos Patricio, Rui Pedro    \n" +
                    "Iria Santos Moutinho, Joao Filipe    \n" +
                    "Jimenez Rodriguez, Raul Alonso    \n" +
                    "Kilman, Maximilian*\n" +
                    "Marcal De Oliveira, Fernando    \n" +
                    "Ruddy, John Thomas Gordon*\n" +
                    "Saiss, Romain Ghanem Paul    \n" +
                    "Sarkic, Matija*\n" +
                    "Traore Diarra, Adama"
    )

    private val clubPhotos = intArrayOf(
        R.drawable.ic_arsenal,
        R.drawable.ic_aston_villa,
        R.drawable.ic_brighton,
        R.drawable.ic_burnley,
        R.drawable.ic_chelsea,
        R.drawable.ic_crytal_palace,
        R.drawable.ic_everton,
        R.drawable.ic_fulham,
        R.drawable.ic_leeds,
        R.drawable.ic_leicester,
        R.drawable.ic_liverpool,
        R.drawable.ic_man_city,
        R.drawable.ic_man_united,
        R.drawable.ic_newcastle_utd,
        R.drawable.ic_sheffield,
        R.drawable.ic_southampton,
        R.drawable.ic_tottenham,
        R.drawable.ic_westbrom,
        R.drawable.ic_westham,
        R.drawable.ic_wolves

    )

    private val isClubFav = booleanArrayOf(
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false
    )

    val listData: ArrayList<Club>
        get() {
            val list = arrayListOf<Club>()
            for (position in clubNames.indices){
                val club = Club()
                club.name = clubNames[position]
                club.manager = clubManagers[position]
                club.nickname = clubNicknames[position]
                club.stadium = clubStadiums[position]
                club.location = clubLocations[position]
                club.owner = clubOwners[position]
                club.detail = clubDetails[position]
                club.squad = clubSquads[position]
                club.photo = clubPhotos[position]
                club.isFav = isClubFav[position]
                list.add(club)
            }
            return list
        }
}