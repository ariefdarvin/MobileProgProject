package com.example.projectmobile.Bottom;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.projectmobile.FruitDetail;
import com.example.projectmobile.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    ListView listview;
    String fruitNamee[] = {"Apple", "Banana", "Jackfruit", "Mango", "Melon", "Orange", "Papaya", "Pomegranate", "Strawberry", "Watermelon"};
    String fruitDescc[] = {"An apple is an edible fruit produced by an apple tree (Malus domestica). Apple trees are cultivated worldwide and are the most widely grown species in the genus Malus. The tree originated in Central Asia, where its wild ancestor, Malus sieversii, is still found today. Apples have been grown for thousands of years in Asia and Europe and were brought to North America by European colonists. Apples have religious and mythological significance in many cultures, including Norse, Greek, and European Christian tradition.\n\n Source : https://en.wikipedia.org/wiki/Apple",
                            "A banana is an elongated, edible fruit – botanically a berry – produced by several kinds of large herbaceous flowering plants in the genus Musa.In some countries, bananas used for cooking may be called \"plantains\", distinguishing them from dessert bananas. The fruit is variable in size, color, and firmness, but is usually elongated and curved, with soft flesh rich in starch covered with a rind, which may be green, yellow, red, purple, or brown when ripe.\n" +
                                    "\nThe fruits grow upward in clusters near the top of the plant. Almost all modern edible seedless (parthenocarp) bananas come from two wild species – Musa acuminata and Musa balbisiana. The scientific names of most cultivated bananas are Musa acuminata, Musa balbisiana, and Musa × paradisiaca for the hybrid Musa acuminata × M. balbisiana, depending on their genomic constitution. The old scientific name for this hybrid, Musa sapientum, is no longer used.\n\n Source : https://en.wikipedia.org/wiki/Banana",
                            "The jackfruit (Artocarpus heterophyllus), also known as jack tree, is a species of tree in the fig, mulberry, and breadfruit family (Moraceae). Its origin is in the region between the Western Ghats of southern India, all of Sri Lanka and the rainforests of Malaysia, Indonesia and the Philippines. Jackfruit is commonly used in South and Southeast Asian cuisines. Both ripe and unripe fruits are consumed.\n" +
                                    "\nThe jackfruit is the national fruit of Bangladesh and Sri Lanka, and the state fruit of the Indian states of Karnataka, Kerala and Tamil Nadu. It is available internationally canned or frozen and in chilled meals as are various products derived from the fruit such as noodles and chips.\n\n Source : https://en.wikipedia.org/wiki/Jackfruit",
                            "A mango is an edible stone fruit produced by the tropical tree Mangifera indica which is believed to have originated from the region between northwestern Myanmar, Bangladesh, and northeastern India. M. indica has been cultivated in South and Southeast Asia since ancient times resulting in two distinct types of modern mango cultivars: the \"Indian type\" and the \"Southeast Asian type\". Other species in the genus Mangifera also produce edible fruits that are also called \"mangoes\", the majority of which are found in the Malesian ecoregion.\n\n Source : https://en.wikipedia.org/wiki/Mango",
                            "A melon is any of various plants of the family Cucurbitaceae with sweet, edible, and fleshy fruit. The word \"melon\" can refer to either the plant or specifically to the fruit. Botanically, a melon is a kind of berry, specifically a \"pepo\". The word melon derives from Latin melopepo, which is the latinization of the Greek μηλοπέπων (mēlopepōn), meaning \"melon\", itself a compound of μῆλον (mēlon), \"apple, treefruit (of any kind)\" and πέπων (pepōn), amongst others \"a kind of gourd or melon\". Many different cultivars have been produced, particularly of cantaloupes.\n\n Source : https://en.wikipedia.org/wiki/Melon",
                            "An orange is a fruit of various citrus species in the family Rutaceae (see list of plants known as orange); it primarily refers to Citrus × sinensis, which is also called sweet orange, to distinguish it from the related Citrus × aurantium, referred to as bitter orange. The sweet orange reproduces asexually (apomixis through nucellar embryony); varieties of sweet orange arise through mutations. \n" +
                                    "\nThe orange is a hybrid between pomelo (Citrus maxima) and mandarin (Citrus reticulata). The chloroplast genome, and therefore the maternal line, is that of pomelo. The sweet orange has had its full genome sequenced. \n" +
                                    "\nThe orange originated in a region encompassing Southern China, Northeast India, and Myanmar, and the earliest mention of the sweet orange was in Chinese literature in 314 BC. As of 1987, orange trees were found to be the most cultivated fruit tree in the world. Orange trees are widely grown in tropical and subtropical climates for their sweet fruit. The fruit of the orange tree can be eaten fresh, or processed for its juice or fragrant peel. As of 2012, sweet oranges accounted for approximately 70% of citrus production.\n\n Source : https://en.wikipedia.org/wiki/Orange_(fruit)",
                            "The papaya is a small, sparsely branched tree, usually with a single stem growing from 5 to 10 m (16 to 33 ft) tall, with spirally arranged leaves confined to the top of the trunk. The lower trunk is conspicuously scarred where leaves and fruit were borne. The leaves are large, 50–70 cm (20–28 in) in diameter, deeply palmately lobed, with seven lobes. All parts of the plant contain latex in articulated laticifers. Papayas are dioecious.\n" +
                                    "\nThe flowers are five-parted and highly dimorphic; the male flowers have the stamens fused to the petals. The female flowers have a superior ovary and five contorted petals loosely connected at the base. Male and female flowers are borne in the leaf axils, and the males are multiflowered dichasia, and the female flowers are in few-flowered dichasia.\n" +
                                    "\nThe pollen grains are elongated and approximately 35 microns in length. The flowers are sweet-scented, open at night, and wind- or insect-pollinated.\n\n Source : https://en.wikipedia.org/wiki/Papaya",
                            "The pomegranate (Punica granatum) is a fruit-bearing deciduous shrub in the family Lythraceae, subfamily Punicoideae, that grows between 5 and 10 m (16 and 33 ft) tall.\n" +
                                    "\nThe pomegranate was originally described throughout the Mediterranean region. It was introduced into Spanish America in the late 16th century and into California by Spanish settlers in 1769. \n" +
                                    "\nThe fruit is typically in season in the Northern Hemisphere from October to February, and in the Southern Hemisphere from March to May. As intact sarcotestas or juice, pomegranates are used in baking, cooking, juice blends, meal garnishes, smoothies, and alcoholic beverages, such as cocktails and wine.\n" +
                                    "\nPomegranates are widely cultivated throughout the Middle East and Caucasus region, north and tropical Africa, Iran, the Indian subcontinent, Central Asia, the drier parts of Southeast Asia, and the Mediterranean Basin. \n\n Source : https://en.wikipedia.org/wiki/Pomegranate",
                            "The strawberry fruit was mentioned in ancient Roman literature in reference to its medicinal use. The French began taking the strawberry from the forest to their gardens for harvest in the 14th century. Charles V, France's king from 1364 to 1380, had 1,200 strawberry plants in his royal garden. In the early 15th century western European monks were using the wild strawberry in their illuminated manuscripts. The strawberry is found in Italian, Flemish, and German art, and in English miniatures. The entire strawberry plant was used to treat depressive illnesses.\n" +
                                    "\nBy the 16th century, references of cultivation of the strawberry became more common. People began using it for its supposed medicinal properties and botanists began naming the different species. In England the demand for regular strawberry farming had increased by the mid-16th century.\n" +
                                    "\n\n Source : https://en.wikipedia.org/wiki/Strawberry",
                            "The watermelon is an annual that has a prostrate or climbing habit. Stems are up to 3 metres (10 feet) long and new growth has yellow or brown hairs. Leaves are 60 to 200 millimetres (2+1⁄4 to 7+3⁄4 inches) long and 40 to 150 mm (1+1⁄2 to 6 in) wide.\n" +
                                    "\nThese usually have three lobes that are lobed or doubly lobed. Young growth is densely woolly with yellowish-brown hairs which disappear as the plant ages. Like all but one species in the genus Citrullus, watermelon has branching tendrils. Plants have unisexual male or female flowers that are white or yellow and borne on 40-millimetre-long (1+1⁄2 in) hairy stalks.\n"+
                                    "\nEach flower grows singly in the leaf axils, and the species' sexual system, with male and female flowers produced on each plant, is (monoecious). The male flowers predominate at the beginning of the season; the female flowers, which develop later, have inferior ovaries. The styles are united into a single column.\n\n Source : https://en.wikipedia.org/wiki/Watermelon",
                            };
    int imagess[] = {R.drawable.apple,
                    R.drawable.banana,
                    R.drawable.jackfruit,
                    R.drawable.mango,
                    R.drawable.melon,
                    R.drawable.orange,
                    R.drawable.papaya,
                    R.drawable.pomegranate,
                    R.drawable.strawberry,
                    R.drawable.watermelon
                     };


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FirstFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        listview = view.findViewById(R.id.fruitlistview);

        MyAdapter adapter = new MyAdapter(getActivity(), fruitNamee, fruitDescc, imagess);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                   Intent intent = new Intent(getActivity(), FruitDetail.class);
                   Bundle bundle = new Bundle();
                   bundle.putInt("image",imagess[0]);
                   intent.putExtras(bundle);
                   intent.putExtra("fruitName", fruitNamee[0]);
                   intent.putExtra("fruitDesc", fruitDescc[0]);
                   intent.putExtra("position", ""+0);
                   startActivity(intent);
                }
                if(i == 1){
                    Intent intent = new Intent(getActivity(), FruitDetail.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",imagess[1]);
                    intent.putExtras(bundle);
                    intent.putExtra("fruitName", fruitNamee[1]);
                    intent.putExtra("fruitDesc", fruitDescc[1]);
                    intent.putExtra("position", ""+1);
                    startActivity(intent);
                }
                if(i == 2){
                    Intent intent = new Intent(getActivity(), FruitDetail.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",imagess[2]);
                    intent.putExtras(bundle);
                    intent.putExtra("fruitName", fruitNamee[2]);
                    intent.putExtra("fruitDesc", fruitDescc[2]);
                    intent.putExtra("position", ""+2);
                    startActivity(intent);
                }
                if(i == 3){
                    Intent intent = new Intent(getActivity(), FruitDetail.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",imagess[3]);
                    intent.putExtras(bundle);
                    intent.putExtra("fruitName", fruitNamee[3]);
                    intent.putExtra("fruitDesc", fruitDescc[3]);
                    intent.putExtra("position", ""+3);
                    startActivity(intent);
                }
                if(i == 4){
                    Intent intent = new Intent(getActivity(), FruitDetail.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",imagess[4]);
                    intent.putExtras(bundle);
                    intent.putExtra("fruitName", fruitNamee[4]);
                    intent.putExtra("fruitDesc", fruitDescc[4]);
                    intent.putExtra("position", ""+4);
                    startActivity(intent);
                }
                if(i == 5){
                    Intent intent = new Intent(getActivity(), FruitDetail.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",imagess[5]);
                    intent.putExtras(bundle);
                    intent.putExtra("fruitName", fruitNamee[5]);
                    intent.putExtra("fruitDesc", fruitDescc[5]);
                    intent.putExtra("position", ""+5);
                    startActivity(intent);
                }
                if(i == 6){
                    Intent intent = new Intent(getActivity(), FruitDetail.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",imagess[6]);
                    intent.putExtras(bundle);
                    intent.putExtra("fruitName", fruitNamee[6]);
                    intent.putExtra("fruitDesc", fruitDescc[6]);
                    intent.putExtra("position", ""+6);
                    startActivity(intent);
                }
                if(i == 7){
                    Intent intent = new Intent(getActivity(), FruitDetail.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",imagess[7]);
                    intent.putExtras(bundle);
                    intent.putExtra("fruitName", fruitNamee[7]);
                    intent.putExtra("fruitDesc", fruitDescc[7]);
                    intent.putExtra("position", ""+7);
                    startActivity(intent);
                }
                if(i == 8){
                    Intent intent = new Intent(getActivity(), FruitDetail.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",imagess[8]);
                    intent.putExtras(bundle);
                    intent.putExtra("fruitName", fruitNamee[8]);
                    intent.putExtra("fruitDesc", fruitDescc[8]);
                    intent.putExtra("position", ""+8);
                    startActivity(intent);
                }
                if(i == 9){
                    Intent intent = new Intent(getActivity(), FruitDetail.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",imagess[9]);
                    intent.putExtras(bundle);
                    intent.putExtra("fruitName", fruitNamee[9]);
                    intent.putExtra("fruitDesc", fruitDescc[9]);
                    intent.putExtra("position", ""+9);
                    startActivity(intent);
                }
            }
        });

        return view;
    }
    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String fruitNamee[];
        String fruitDescc[];
        int imagess[];
        MyAdapter (Context c, String fruitName[], String fruitDesc[], int images[]){
            super(c, R.layout.fruit_item_list, R.id.fruitName, fruitName);
            this.context=c;
            this.fruitNamee=fruitName;
            this.fruitDescc=fruitDesc;
            this.imagess=images;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View fruitList = layoutInflater.inflate(R.layout.fruit_item_list, parent, false);
            ImageView images = fruitList.findViewById(R.id.imageList);
            TextView fruitName = fruitList.findViewById(R.id.fruitName);
            TextView fruitDesc = fruitList.findViewById(R.id.fruitDesc);

            images.setImageResource(imagess[position]);
            fruitName.setText(fruitNamee[position]);
            fruitDesc.setText(fruitDescc[position]);

            return fruitList;
        }
    }
}