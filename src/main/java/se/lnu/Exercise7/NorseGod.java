package ne222hz_assign3.Exercise7;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NorseGod extends Application {

	private String name;
	private String race;
	private String decs;

	public NorseGod() {

	}

	public NorseGod(String name, String race, String decs) {
		this.name = name;
		this.race = race;
		this.decs = decs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		if (race.length() == 0) {
			System.err.println("No Description");
		}
		this.race = race;
	}

	public String getDecs() {
		return decs;
	}

	public void setDecs(String decs) {
		this.decs = decs;
	}

	public void start(Stage primaryStage) throws Exception {
		ArrayList<NorseGod> Godsarray = new ArrayList<>();

		NorseGod g1 = new NorseGod("Odin", "Aesir",
				"Odin (/ˈoʊdɪn/;[1] from Old Norse: Óðinn, IPA: [ˈoːðinː]) is a widely revered god in Germanic mythology. Norse mythology, the source of most surviving information about him, associates Odin with wisdom, healing, death, royalty, the gallows, knowledge, war, battle, victory, sorcery, poetry, frenzy, and the runic symbols, and portrays him as the husband of the goddess Frigg. In wider Germanic mythology and paganism, the god was known in Old English as Wōden, in Old Saxon as Wōdan, in Old Dutch as Wuodan[2]and in Old High German as Wuotan.\r\n"
						+ "\r\n"
						+ "Odin appears as a prominent god throughout the recorded history of Europe, from the Roman occupation of regions of Germania (from c.  12 BCE) through the tribal expansions of the Migration Period (4th to 6th centuries CE) and the Viking Age (8th to 11th centuries CE). In the modern period the rural folklore of Germanic Europe continued to acknowledge Odin. References to him appear in place names throughout regions historically inhabited by the ancient Germanic peoples, and the day of the week Wednesday bears his name in many Germanic languages, including in English.\r\n"
						+ "\r\n"
						+ "In Old English texts, Odin holds a particular place as a euhemerized ancestral figure among royalty, and he is frequently referred to as a founding figure among various other Germanic peoples, such as the Langobards. Forms of his name appear frequently throughout the Germanic record, though narratives regarding Odin are mainly found in Old Norse works recorded in Iceland, primarily around the 13th century. These texts make up the bulk of modern understanding of Norse mythology.\r\n"
						+ "\r\n"
						+ "Old Norse texts portray Odin as one-eyed and long-bearded, frequently wielding a spear named Gungnir and wearing a cloak and a broad hat. He is often accompanied by his animal companions and familiars—the wolves Geri and Freki and the ravens Huginn and Muninn, who bring him information from all over Midgard—and rides the flying, eight-legged steed Sleipnir across the sky and into the underworld. Odin is the son of Bestla and Borr and has two brothers, Vili and Vé. Odin is attested as having many sons, most famously the gods Thor (with Jörð) and Baldr (with Frigg), and is known by hundreds of names. In these texts he frequently seeks greater knowledge, at times in disguise (most famously by obtaining the Mead of Poetry), makes wagers with his wife Frigg over the outcome of exploits, and takes part both in the creation of the world by way of slaying the primordial being Ymir and in giving the gift of life to the first two humans Ask and Embla. Odin has a particular association with Yule, and mankind's knowledge of both the runes and poetry is also attributed to him, giving Odin aspects of the culture hero.\r\n"
						+ "\r\n"
						+ "Old Norse texts associate female beings connected with the battlefield—the valkyries—with the god, and Odin oversees Valhalla, where he receives half of those who die in battle, the einherjar. The other half are chosen by the goddess Freyja for her afterlife-location, Fólkvangr. Odin consults the disembodied, herb-embalmed head of the wise being Mímir for advice, and during the foretold events of Ragnarök Odin is told to lead the einherjar into battle before being consumed by the monstrous wolf Fenrir. In later folklore Odin appears as a leader of the Wild Hunt, a ghostly procession of the dead through the winter sky. He is associated with charms and other forms of magic, particularly in Old English and Old Norse texts.\r\n"
						+ "\r\n"
						+ "Odin is a frequent subject of interest in Germanic studies, and scholars have advanced numerous theories regarding his development. Some of these focus on Odin's particular relation to other figures; for example, the fact that Freyja's husband Óðr appears to be something of an etymological doublet of the god, whereas Odin's wife Frigg is in many ways similar to Freyja, and that Odin has a particular relation to the figure of Loki. Other approaches focus on Odin's place in the historical record, a frequent question being whether the figure of Odin derives from Proto-Indo-European mythology, or whether he developed later in Germanic society. In the modern period the figure of Odin has inspired numerous works of poetry, music, and other cultural expressions. He is venerated in most forms of the new religious movement Heathenry, together with other gods venerated by the ancient Germanic peoples; some branches focus particularly on him.");
		Godsarray.add(g1);
		NorseGod g2 = new NorseGod("Thor", "Aesir",
				"In Germanic mythology, Thor (/θɔːr/; from Old Norse: Þórr, runic ᚦᚢᚱ þur) is a hammer-wielding god associated with thunder, lightning, storms, sacred groves and trees, strength, the protection of mankind and also hallowing and fertility. Besides Old Norse Þórr, extensions of the god occur in Old English as Þunor and in Old High German as Donar (runic ᚦᛟᚾᚨᚱ þonar). All forms of the deity stem from a Common Germanic *Þunraz (meaning thunder).\r\n"
						+ "\r\n"
						+ "Thor is a prominently mentioned god throughout the recorded history of the Germanic peoples, from the Roman occupation of regions of Germania, to the tribal expansions of the Migration Period, to his high popularity during the Viking Age, when, in the face of the process of the Christianization of Scandinavia, emblems of his hammer, Mjölnir, were worn and Norse pagan personal names containing the name of the god bear witness to his popularity.\r\n"
						+ "\r\n"
						+ "Due to the nature of the Germanic corpus, narratives featuring Thor are only attested in Old Norse, where Thor appears throughout Norse mythology. Norse mythology, largely recorded in Iceland from traditional material stemming from Scandinavia, provides numerous tales featuring the god. In these sources, Thor bears at least fifteen names, is the husband of the golden-haired goddess Sif, is the lover of the jötunn Járnsaxa, and is generally described as fierce eyed, red haired and red bearded.[2] With Sif, Thor fathered the goddess (and possible valkyrie) Þrúðr; with Járnsaxa, he fathered Magni; with a mother whose name is not recorded, he fathered Móði, and he is the stepfather of the god Ullr. By way of Odin, Thor has numerous brothers, including Baldr. Thor has two servants, Þjálfi and Röskva, rides in a cart or chariot pulled by two goats, Tanngrisnir and Tanngnjóstr (that he eats and resurrects), and is ascribed three dwellings (Bilskirnir, Þrúðheimr, and Þrúðvangr). Thor wields the mountain-crushing hammer, Mjölnir, wears the belt Megingjörð and the iron gloves Járngreipr, and owns the staff Gríðarvölr. Thor's exploits, including his relentless slaughter of his foes and fierce battles with the monstrous serpent Jörmungandr—and their foretold mutual deaths during the events of Ragnarök—are recorded throughout sources for Norse mythology.\r\n"
						+ "\r\n"
						+ "Into the modern period, Thor continued to be acknowledged in rural folklore throughout Germanic-speaking Europe. Thor is frequently referred to in place names, the day of the week Thursday bears his name (modern English Thursday derives from Old English Þūnresdæg, 'Þunor's day'), and names stemming from the pagan period containing his own continue to be used today, particularly in Scandinavia. Thor has inspired numerous works of art and references to Thor appear in modern popular culture. Like other Germanic deities, veneration of Thor is revived in the modern period in Heathenry.");
		Godsarray.add(g2);
		NorseGod g3 = new NorseGod("Loki", "Giant",
				"Loki (pronounced “LOAK-ee;” Old Norse Loki, the meaning of which will be discussed below) is the wily trickster god of Norse mythology.\r\n"
						+ "\r\n"
						+ "While treated as a nominal member of the gods, Loki occupies a highly ambivalent and ultimately unique position among the gods, giants, and the other kinds of spiritual beings that populate the pre-Christian Norse religion.\r\n"
						+ "\r\n"
						+ "His familial relations attest to this. His father is the giant Farbauti (Old Norse Fárbauti, “Cruel Striker”[1]). His mother is Laufey (the meaning of which is unknown) or Nal (Nál, “Needle”[2]). Laufey/Nal could be a goddess, a giantess, or something else entirely – the surviving sources are silent on this point. Loki is the father, by the giantess Angrboda (Angrboða, “Anguish-Boding”), of Hel, the goddess of the underworld; Jormungand, the great serpent who slays Thor during Ragnarok; and Fenrir, the wolf who bites off one of the hands of Tyr and who kills Odin during Ragnarok – hardly a reputable brood, to say the least. As we’ll see below, Loki demonstrates a complete lack of concern for the well-being of his fellow gods, a trait which could be discerned, in vague outline, merely by considering these offspring of his.\r\n"
						+ "\r\n"
						+ "With his proper wife Sigyn (“Friend of Victory”[3]), he also has a son named Nari or Narfi, whose name might mean “Corpse.”[4]\r\n"
						+ "\r\n"
						+ "Loki often runs afoul not only of societal expectations, but also of what we might call “the laws of nature.” In addition to the progeny listed above, Loki is also the mother – yes, the mother – of Sleipnir, Odin’s shamanic horse, whom Loki gave birth to after shapeshifting into a mare and courting the stallion Svadilfari, as is recounted in the tale of The Fortification of Asgard.\r\n"
						+ "\r\n"
						+ "In the tales, Loki is portrayed as a scheming coward who cares only for shallow pleasures and self-preservation. He’s by turns playful, malicious, and helpful, but he’s always irreverent and nihilistic.\r\n"
						+ "\r\n"
						+ "For example, in the tale of The Kidnapping of Idun, Loki, by his recklessness, ends up in the hands of a furious giant, Thiazi, who threatens to kill Loki unless he brings him the goddess Idun. Loki complies in order to save his life, and then finds himself in the awkward position of having the gods threaten him with death unless he rescues Idun. He agrees to this request for the same base motive, shifting his shape into that of a falcon and carrying the goddess back to Asgard in his talons. Thiazi pursues him desperately in the form of an eagle, but, having almost caught up with Loki as he nears his destination, the gods light a fire around the perimeter of their fortress. The flames catch Thiazi and burn him to death, while Idun and Loki reach the halls of the gods safely. Loki ultimately comes to the aid of the gods, but only to rectify a calamity for which he himself is responsible. This theme is repeated in numerous tales, such as in The Creation of Thor’s Hammer and the aforementioned The Fortification of Asgard.\r\n"
						+ "\r\n"
						+ "After Thiazi’s death, the giant’s daughter, Skadi, arrives in Asgard demanding restitution for the slaying of her father. One of her demands is that the gods make her laugh, something which only Loki is able to do. To accomplish this, he ties one end of a rope to the beard of a goat and the other end to his testicles. Both he and the goat squawk and squeal as one pulls one way and the other pulls the other way. Eventually he falls over in Skadi’s lap, and the giantess can’t help but laugh at such an absurd spectacle. Here, Loki once again comes to the aid of the gods, but simply by being silly and outlandish, not by accomplishing any feat that a Viking Age Scandinavian would have found to be particularly honorable.\r\n"
						+ "\r\n"
						+ "Loki alternately helps both the gods and the giants, depending on which course of action is most pleasurable and advantageous to him at the time. During Ragnarok, when the gods and giants engage in their ultimate struggle and the cosmos is destroyed, Loki joins the battle on the side of the giants. According to one Old Norse poem, he even captains the ship Naglfar, “Nail Ship,” which brings many of the giants to their battle with the gods.[5] When the battle for the world is fought, he and the god Heimdall mortally wound each other.\r\n"
						+ "\r\n"
						+ "Loki is perhaps best known for his malevolent role in The Death of Baldur. After the death of the beloved god Baldur is prophesied, Baldur’s mother, Frigg, secures a promise from every living thing to not harm her son. Well, almost everything – no such oath is obtained from the mistletoe, which the gods think too small and safe a thing to harm Baldur. Upon discovering this omission, Loki carves a mistletoe spear, places it in the hands of the blind god Hod, and instructs him to throw it at Baldur. Hod, not knowing the origin of the weapon, complies, and Baldur is impaled and dies. The god Hermod rides Sleipnir to the underworld and implores Hel to release Baldur, pointing out how beloved he is by all living things. Hel retorts that if this is so, then it shouldn’t be difficult to compel every being in the world to weep for Baldur, and, should this happen, the dead god would be released from the grave. Every living thing does indeed cry for Baldur’s return, with one sole exception: a frost-hearted giantess named Tokk (Þökk, “Thanks”), who is almost certainly Loki in disguise. So Baldur must remain with Hel.\r\n"
						+ "\r\n"
						+ "For his many crimes against them, the gods eventually forge a chain from the entrails of Loki’s son Narfi and tie him down to three rocks inside a cave. A venomous serpent sits above him, dripping poison onto him. Loki’s apparently very faithful and loving wife, Sigyn, sits at his side with a bowl to catch the venom. But when the bowl becomes full, of course, she has to leave her husband’s side to pour it out. When this happens, the drops of venom that fall onto him cause him to writhe in agony, and these convulsions create earthquakes. And in this state he lies until breaking free at Ragnarok.\r\n"
						+ "\r\n"
						+ "A fascinating variant of the tale of Loki’s being bound comes to us from the medieval Danish historian Saxo Grammaticus. In his History of the Danes, Thor, on one of his many journeys to Jotunheim, the homeland of the giants, finds a giant named Útgarðaloki (“Loki of the Utgard“). Útgarðaloki is bound in exactly the same manner as that in which Loki is bound in the tale mentioned above, which comes from Icelandic sources.[6][7] It seems that even the pagan Scandinavians themselves held conflicting views on whether Loki was a god, a giant, or something else entirely.\r\n"
						+ "\r\n"
						+ "For the centuries that Norse mythology has been a subject of scholarly study, scholars have been unable to explain the meaning of Loki’s name in any convincing way. Most have simply thrown their hands up and declared the meaning of his name to be unknown and probably unknowable. Recently, however, the philologist Eldar Heide may have solved this puzzle. In his research into Nordic folklore from periods more recent than the Viking Age, Heide noticed that Loki often appears in contexts that liken him to a knot on a thread. In fact, in later Icelandic usage, the common noun loki even means “knot” or “tangle.” Spiders are sometimes referred to as loki in a metaphorical sense, as their webs are compared to the fish nets (which are made from a series of knots and loops) that Loki crafts in certain surviving Viking Age myths. From all of this, the most straightforward meaning of Loki’s name would seem to be “Knot” or “Tangle.”[8][9]\r\n"
						+ "\r\n"
						+ "This proposed meaning of Loki’s name powerfully resonates with his role in Norse mythology in two ways. First, it points to his role as a maker of nets, both literal fish nets and metaphorical “nets” in the form of his cunning schemes that trap the gods in perilous situations. Second, it could indicate his being the “knot” in the otherwise straight thread of the gods and their world, the fatal flaw that ultimately brings about their demise.\r\n"
						+ "\r\n"
						+ "Even though Loki is in some sense a god, no traces of any kind of worship of Loki have survived in the historical record.[10] Is this any wonder, given that his character is virtually the antithesis of traditional Norse values of honor, loyalty, and the like – and that he is ultimately a traitor to the divinities the Norse held in such reverence?\r\n"
						+ "\r\n"
						+ "Looking for more great information on Norse mythology and religion? While this site provides the ultimate online introduction to the topic, my book The Viking Spirit provides the ultimate introduction to Norse mythology and religion period. I’ve also written a popular list of The 10 Best Norse Mythology Books, which you’ll probably find helpful in your pursuit.");
		NorseGod g4 = new NorseGod("Baldr", "Aesir",
				"Baldr (also Balder, Baldur) is the god of light, joy, purity, and the summer sun in Norse mythology, and a son of the god Odin and the goddess Frigg. He is the father of Forseti, and he has numerous brothers, such as Thor and Váli.\r\n"
						+ "\r\n"
						+ "In the 12th century, Danish accounts by Saxo Grammaticus and other Danish Latin chroniclers recorded a euhemerized account of his story. Compiled in Iceland in the 13th century, but based on much older Old Norse poetry, the Poetic Edda and the Prose Edda contain numerous references to the death of Baldr as both a great tragedy to the Æsir and a harbinger of Ragnarök. In addition to being loved by all gods and more physical beings, he was so handsome, generous, and good that he gave off light simply by the purity of his character.\r\n"
						+ "\r\n"
						+ "According to Gylfaginning, a book of Snorri Sturluson's Prose Edda, Baldr's wife is Nanna and their son is Forseti. In Gylfaginning, Snorri relates that Baldr had the greatest ship ever built, Hringhorni, and that there is no place more beautiful than his hall, Breidablik.");
		Godsarray.add(g4);
		NorseGod g5 = new NorseGod("Freyr", "Aesir",
				"\"Frey\" redirects here. For Freÿr, see Castle of Freÿr. For other uses of \"Frey\" and \"Freyr\", see Frey (disambiguation).\r\n"
						+ "\r\n" + "The Rällinge statuette, believed to depict Freyr, viking age.\r\n"
						+ "Freyr (Old Norse: Lord), sometimes anglicized as Frey, is a widely attested god in Norse mythology, associated with sacral kingship, battle, virility, peace and prosperity, with sunshine and fair weather, and with good harvest. Freyr, sometimes referred to as Yngvi-Freyr, was especially associated with Sweden and seen as an ancestor of the Swedish royal house. According to Adam of Bremen, Freyr was associated with peace and pleasure, and was represented with a phallic statue in the Temple at Uppsala. According to Snorri Sturluson, Freyr was \"the most renowned of the æsir\", and was venerated for good harvest and peace.\r\n"
						+ "\r\n"
						+ "In the mythological stories in the Icelandic books the Poetic Edda and the Prose Edda, Freyr is presented as one of the Vanir, the son of the sea god Njörðr, or Njord, as well as the twin brother of the goddess Freyja. The gods gave him Álfheimr, the realm of the Elves, as a teething present. He rides the shining dwarf-made boar Gullinbursti and possesses the ship Skíðblaðnir which always has a favorable breeze and can be folded together and carried in a pouch when it is not being used. Freyr is also known to have been associated with the horse cult. He also kept sacred horses in his sanctuary at Throndheim in Norway.[1] He has the servants Skírnir, Byggvir and Beyla.\r\n"
						+ "\r\n"
						+ "The most extensive surviving Freyr myth relates Freyr's falling in love with the female jötunn Gerðr. Eventually, she becomes his wife but first Freyr has to give away his sword which fights on its own \"if wise be he who wields it.\" Although deprived of this weapon, Freyr defeats the jötunn Beli with an antler. However, lacking his sword, Freyr will be killed by the fire jötunn Surtr during the events of Ragnarök.\r\n"
						+ "\r\n"
						+ "Like other Germanic deities, veneration of Freyr is revived during the modern period through the Heathenry movement.");
		Godsarray.add(g5);
		NorseGod g6 = new NorseGod("Freyja", "Aesir",
				"In Norse mythology, Freyja (/ˈfreɪə/; Old Norse for \"(the) Lady\") is a goddess associated with love, beauty, fertility, gold, and seiðr. Freyja is the owner of the necklace Brísingamen, rides a chariot pulled by two cats, is accompanied by the boar Hildisvíni, and possesses a cloak of falcon feathers. By her husband Óðr, she is the mother of two daughters, Hnoss and Gersemi. Along with her brother Freyr, her father Njörðr, and her mother (Njörðr's sister, unnamed in sources), she is a member of the Vanir. Stemming from Old Norse Freyja, modern forms of the name include Freya, Freyia, and Freja.\r\n"
						+ "\r\n"
						+ "Freyja rules over her heavenly field, Fólkvangr, where she receives half of those who die in battle. The other half go to the god Odin's hall, Valhalla. Within Fólkvangr lies her hall, Sessrúmnir. Freyja assists other deities by allowing them to use her feathered cloak, is invoked in matters of fertility and love, and is frequently sought after by powerful jötnar who wish to make her their wife. Freyja's husband, the god Óðr, is frequently absent. She cries tears of red gold for him, and searches for him under assumed names. Freyja has numerous names, including Gefn, Hörn, Mardöll, Sýr, Valfreyja, and Vanadís.\r\n"
						+ "\r\n"
						+ "Freyja is attested in the Poetic Edda, compiled in the 13th century from earlier traditional sources; in the Prose Edda and Heimskringla, composed by Snorri Sturluson in the 13th century; in several Sagas of Icelanders; in the short story \"Sörla þáttr\"; in the poetry of skalds; and into the modern age in Scandinavian folklore.\r\n"
						+ "\r\n"
						+ "Scholars have debated whether Freyja and the goddess Frigg ultimately stem from a single goddess common among the Germanic peoples; connected her to the valkyries, female battlefield choosers of the slain; and analyzed her relation to other goddesses and figures in Germanic mythology, including the thrice-burnt and thrice-reborn Gullveig/Heiðr, the goddesses Gefjon, Skaði, Þorgerðr Hölgabrúðr and Irpa, Menglöð, and the 1st century CE \"Isis\" of the Suebi. Freyja's name appears in numerous place names in Scandinavia, with a high concentration in southern Sweden. Various plants in Scandinavia once bore her name, but it was replaced with the name of the Virgin Mary during the process of Christianization. Rural Scandinavians continued to acknowledge Freyja as a supernatural figure into the 19th century, and Freyja has inspired various works of art.");
		Godsarray.add(g6);
		NorseGod g7 = new NorseGod("Heimdallr", "Aesir",
				"In Norse mythology, Heimdallr is a god who possesses the resounding horn Gjallarhorn, owns the golden-maned horse Gulltoppr, is called the shining god and the whitest of the gods, has gold teeth, and is the son of Nine Mothers (who may represent personified waves). Heimdallr is attested as possessing foreknowledge, keen eyesight and hearing, and keeps watch for invaders and the onset of Ragnarök while drinking fine mead in his dwelling Himinbjörg, located where the burning rainbow bridge Bifröst meets the sky. Heimdallr is said to be the originator of social classes among humanity and once regained Freyja's treasured possession Brísingamen while doing battle in the shape of a seal with Loki. Heimdallr and Loki are foretold to kill one another during the events of Ragnarök. Heimdallr is additionally referred to as Rig, Hallinskiði, Gullintanni, and Vindlér or Vindhlér.\r\n"
						+ "\r\n"
						+ "Heimdallr is attested in the Poetic Edda, compiled in the 13th century from earlier traditional material; in the Prose Edda and Heimskringla, both written in the 13th century by Snorri Sturluson; in the poetry of skalds; and on an Old Norse runic inscription found in England. Two lines of an otherwise lost poem about the god, Heimdalargaldr, survive. Due to the problematic and enigmatic nature of these attestations, scholars have produced various theories about the nature of the god, including his apparent relation to rams, that he may be a personification of or connected to the world tree Yggdrasil, and potential Indo-European cognates.");
		Godsarray.add(g7);
		NorseGod g8 = new NorseGod("Tyr", "Aesir",
				"Týr (/tɪər/;[1] Old Norse: Týr, pronounced [tyːr]), Tíw (Old English), and Ziu (Old High German) is a god in Germanic mythology. Stemming from the Proto-Germanic deity *Tīwaz and ultimately from the Proto-Indo-European chief deity *Dyeus, little information about the god survives beyond Old Norse sources. Due to the etymology of the god's name and the shadowy presence of the god in the extant Germanic corpus, some scholars propose that Týr may have once held a more central place among the deities of early Germanic mythology.\r\n"
						+ "\r\n"
						+ "Týr is the namesake of the Tiwaz rune (ᛏ), a letter of the runic alphabet corresponding to the Latin letter T. By way of the process of interpretatio germanica, the deity is the namesake of Tuesday ('Týr's day') in Germanic languages, including English. Interpretatio romana, in which Romans interpreted other gods as forms of their own, generally renders the god as Mars, the ancient Roman war god, and it is through that lens that most Latin references to the god occur. For example, the god may be referenced as Mars Thingsus (Latin 'Mars of the Thing') on 3rd century Latin inscription, reflecting a strong association with the Germanic thing, a legislative body among the ancient Germanic peoples.\r\n"
						+ "\r\n"
						+ "In Norse mythology, from which most surviving narratives about gods among the Germanic peoples stem, Týr sacrifices his arm to the monstrous wolf Fenrir, who bites off his limb while the gods bind the animal. Týr is foretold to be consumed by the similarly monstrous dog Garmr during the events of Ragnarök. In Old Norse sources, Týr is alternately described as the son of the jötunn Hymir (in Hymiskviða) or of the god Odin (in Skáldskaparmál). Lokasenna makes reference to an unnamed otherwise unknown consort, perhaps also reflected in the continental Germanic record (see Zisa (goddess)).\r\n"
						+ "\r\n"
						+ "Various place names in Scandinavia refer to the god, and a variety of objects found in England and Scandinavia may depict the god or invoke him.");
		Godsarray.add(g8);

		primaryStage.setTitle("Norse Gods");
		DropShadow ds = new DropShadow();
		ds.setOffsetX(1.0f);
		ds.setOffsetY(1.0f);

		VBox layout = new VBox();
		ListView<String> listView = new ListView<>();
		listView.setPrefSize(100, 600);
		listView.setTranslateX(0);
		listView.setTranslateY(0);

		TextArea txtEra = new TextArea();
		txtEra.setTranslateX(100);
		txtEra.setTranslateY(0);
		txtEra.setPrefSize(400, 600);

		txtEra.setWrapText(true);

		BorderPane bP = new BorderPane();

		bP.setLeft(listView);
		bP.setCenter(txtEra);

		listView.getItems().addAll(g1.getName(), g2.getName(), g3.getName(), g4.getName(), g5.getName(), g6.getName(),
				g7.getName(), g8.getName());

		listView.getSelectionModel().selectedItemProperty()
				.addListener((ObservableValue<? extends String> ov, String old_val, String new_val) -> {
					if (new_val.equals("Odin")) {

						txtEra.setText(g1.getName() + "\n" + g1.getRace() + "\n" + "\n" + g1.getDecs());

					} else if (new_val.equals("Thor")) {
						txtEra.setText(g2.getName() + "\n" + g2.getRace() + "\n" + "\n" + g2.getDecs());
					} else if (new_val.equals("Loki")) {
						txtEra.setText(g3.getName() + "\n" + g3.getRace() + "\n" + "\n" + g3.getDecs());

					} else if (new_val.equals("Baldr")) {
						txtEra.setText(g4.getName() + "\n" + g4.getRace() + "\n" + "\n" + g4.getDecs());
					} else if (new_val.equals("Freyr")) {
						txtEra.setText(g5.getName() + "\n" + g5.getRace() + "\n" + "\n" + g5.getDecs());
					} else if (new_val.equals("Freyja")) {
						txtEra.setText(g6.getName() + "\n" + g6.getRace() + "\n" + "\n" + g6.getDecs());
					} else if (new_val.equals("Heimdallr")) {
						txtEra.setText(g7.getName() + "\n" + g7.getRace() + "\n" + "\n" + g7.getDecs());
					} else if (new_val.equals("Tyr")) {
						txtEra.setText(g8.getName() + "\n" + g8.getRace() + "\n" + "\n" + g8.getDecs());
					}
				});

		Group root = new Group(txtEra, listView, layout);
		Scene scene = new Scene(root, 500, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
