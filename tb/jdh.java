package tb;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.e;
import com.taobao.android.sku.utils.o;
import com.taobao.android.sku.widget.HeightMutableFrameLayout;
import com.taobao.android.tbsku.image.PhotoView;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import com.taobao.taobao.R;

/* loaded from: classes6.dex */
public class jdh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f29471a;
    private JSONObject b;
    private JSONArray c;
    private HeightMutableFrameLayout e;
    private ViewPager f;
    private TextView g;
    private TextView h;
    private b i;
    private float d = -0.01f;
    private boolean j = true;

    /* loaded from: classes6.dex */
    public interface b {
        void a(View view);

        void a(JSONObject jSONObject, int i);

        boolean b(View view);
    }

    static {
        kge.a(-1301004249);
    }

    public static /* synthetic */ TextView a(jdh jdhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("ee94e01e", new Object[]{jdhVar}) : jdhVar.g;
    }

    public static /* synthetic */ void a(jdh jdhVar, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9febc13d", new Object[]{jdhVar, jSONObject, new Integer(i)});
        } else {
            jdhVar.a(jSONObject, i);
        }
    }

    public jdh(Context context, JSONObject jSONObject, JSONArray jSONArray) {
        if (context == null || jSONObject == null || jSONArray == null) {
            return;
        }
        this.f29471a = context;
        this.b = jSONObject;
        this.c = jSONArray;
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        AliConfigInterface a2 = e.a();
        if (a2 == null) {
            return;
        }
        this.j = Boolean.parseBoolean(a2.a("android_sku", "convert_jpeg_to_heic", "true"));
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        if (this.e == null) {
            a(this.f29471a, this.b, this.c);
        }
        return this.e;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c44ebfac", new Object[]{this, bVar});
        } else {
            this.i = bVar;
        }
    }

    private void a(Context context, JSONObject jSONObject, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37467bb8", new Object[]{this, context, jSONObject, jSONArray});
            return;
        }
        this.e = (HeightMutableFrameLayout) LayoutInflater.from(context).inflate(R.layout.xsku_image_container, (ViewGroup) null, false);
        this.f = (ViewPager) this.e.findViewById(R.id.view_pager);
        this.g = (TextView) this.e.findViewById(R.id.tv_current_index);
        this.h = (TextView) this.e.findViewById(R.id.tv_total_size);
        this.f.setAdapter(new a(this.i, jSONObject, jSONArray, this.j));
        a(jSONArray);
        a(jSONObject, jSONArray);
        float f = this.d;
        if (f < 1.0E-5f) {
            return;
        }
        this.e.shrinkHeight(f);
        this.d = -0.01f;
    }

    private void a(JSONObject jSONObject, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f94b4b0", new Object[]{this, jSONObject, jSONArray});
            return;
        }
        if (jSONArray != null) {
            TextView textView = this.h;
            textView.setText("" + jSONArray.size());
        }
        String string = jSONObject.getString("pvId");
        String string2 = jSONObject.getString("icon");
        String string3 = jSONObject.getString("url");
        if (!StringUtils.isEmpty(string2)) {
            string3 = string2;
        } else if (StringUtils.isEmpty(string3)) {
            string3 = "";
        }
        if (!StringUtils.isEmpty(string)) {
            int size = jSONArray.size();
            while (i < size) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null && string.equals(jSONObject2.getString("pvId"))) {
                    a(i, jSONArray);
                    return;
                }
                i++;
            }
        } else if (StringUtils.isEmpty(string3)) {
        } else {
            int size2 = jSONArray.size();
            while (i < size2) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (jSONObject3 != null && string3.equals(jSONObject3.getString("url"))) {
                    a(i, jSONArray);
                    return;
                }
                i++;
            }
        }
    }

    private void a(int i, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf240c3", new Object[]{this, new Integer(i), jSONArray});
            return;
        }
        int currentItem = this.f.getCurrentItem();
        this.f.setCurrentItem(i);
        TextView textView = this.g;
        textView.setText("" + (i + 1));
        if (currentItem != i) {
            return;
        }
        a(jSONArray.getJSONObject(i), i);
    }

    private void a(final JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
            return;
        }
        ViewPager viewPager = this.f;
        if (viewPager == null) {
            return;
        }
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: tb.jdh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                }
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                }
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    return;
                }
                TextView a2 = jdh.a(jdh.this);
                a2.setText("" + (i + 1));
                jdh.a(jdh.this, jSONArray.getJSONObject(i), i);
            }
        });
    }

    private void a(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a78e87b", new Object[]{this, jSONObject, new Integer(i)});
            return;
        }
        try {
            if (this.i == null) {
                return;
            }
            this.i.a(jSONObject, i);
        } catch (Throwable unused) {
        }
    }

    /* loaded from: classes6.dex */
    public static class a extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private b f29473a;
        private JSONObject b;
        private JSONArray c;
        private boolean d;

        static {
            kge.a(948640497);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.support.v4.view.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : view == obj;
        }

        public static /* synthetic */ b a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("adbc4ed", new Object[]{aVar}) : aVar.f29473a;
        }

        public a(b bVar, JSONObject jSONObject, JSONArray jSONArray, boolean z) {
            this.f29473a = bVar;
            this.b = jSONObject;
            this.c = jSONArray;
            this.d = z;
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            JSONArray jSONArray = this.c;
            if (jSONArray == null) {
                return 0;
            }
            return jSONArray.size();
        }

        @Override // android.support.v4.view.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xsku_scaleimage, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.txview_popupwindow);
            PhotoView photoView = (PhotoView) inflate.findViewById(R.id.imageviewtouch);
            photoView.setOnClickListener(new View.OnClickListener() { // from class: tb.jdh.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    try {
                        if (a.a(a.this) == null) {
                            return;
                        }
                        a.a(a.this).a(view);
                    } catch (Throwable unused) {
                    }
                }
            });
            photoView.setOnLongClickListener(new View.OnLongClickListener() { // from class: tb.jdh.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                    }
                    try {
                        if (a.a(a.this) != null) {
                            return a.a(a.this).b(view);
                        }
                    } catch (Throwable unused) {
                    }
                    return false;
                }
            });
            JSONObject jSONObject3 = this.c.getJSONObject(i);
            String string = jSONObject3.getString("desc");
            if (StringUtils.isEmpty(string) && (jSONObject2 = this.b) != null) {
                string = jSONObject2.getString("title");
            }
            String string2 = jSONObject3.getString("url");
            if (StringUtils.isEmpty(string2) && (jSONObject = this.b) != null) {
                string2 = jSONObject.getString("icon");
            }
            a(viewGroup.getContext(), textView, string);
            a(viewGroup.getContext(), photoView, string2);
            viewGroup.addView(inflate);
            return inflate;
        }

        private void a(Context context, PhotoView photoView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22434b49", new Object[]{this, context, photoView, str});
                return;
            }
            try {
                if (this.d) {
                    com.taobao.phenix.intf.b.h().a(ImageStrategyDecider.decideUrl(str, 1200, 1200, ImageStrategyConfig.a("default", "9001").a(1200).b(1200).a(TaobaoImageUrlStrategy.ImageQuality.q90).a())).addLoaderExtra(esr.BUNDLE_BIZ_CODE, "9001").into(photoView);
                } else {
                    com.taobao.phenix.intf.b.h().a(str).addLoaderExtra(esr.BUNDLE_BIZ_CODE, "9002").skipCache().into(photoView);
                }
            } catch (Throwable th) {
                o.b(th.toString());
            }
        }

        private void a(Context context, TextView textView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4cba6ae", new Object[]{this, context, textView, str});
            } else if (StringUtils.isEmpty(str)) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
                textView.setVisibility(0);
            }
        }

        @Override // android.support.v4.view.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            } else if (!(obj instanceof View)) {
            } else {
                viewGroup.removeView((View) obj);
            }
        }
    }
}
