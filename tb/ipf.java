package tb;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Bitmap;
import mtopsdk.common.util.StringUtils;
import android.widget.RemoteViews;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.ditto.ClickArea;
import com.taobao.desktop.ditto.anim.AnimConstance;
import com.taobao.desktop.ditto.data.AnimMeta;
import com.taobao.desktop.ditto.data.WidgetContentData;
import com.taobao.desktop.ditto.data.a;
import com.taobao.desktop.widget.manager.g;
import com.taobao.desktop.widget.manager.k;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class ipf extends k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context b;
    private WidgetContentData c;
    private a d;
    private ipd e;
    private Map<String, Object> f;
    private List<Integer> g;
    private String h;
    private int i;
    private RemoteViews j;
    private final AtomicBoolean k;
    private final AtomicBoolean l;

    static {
        kge.a(1195239492);
    }

    public static /* synthetic */ Object ipc$super(ipf ipfVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ ipd a(ipf ipfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ipd) ipChange.ipc$dispatch("7f9f2d90", new Object[]{ipfVar}) : ipfVar.e;
    }

    public static /* synthetic */ void a(ipf ipfVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e2d00c", new Object[]{ipfVar, map});
        } else {
            ipfVar.b(map);
        }
    }

    public static /* synthetic */ a b(ipf ipfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("44b2b684", new Object[]{ipfVar}) : ipfVar.d;
    }

    public static /* synthetic */ AtomicBoolean c(ipf ipfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("4e918edb", new Object[]{ipfVar}) : ipfVar.k;
    }

    public ipf(Context context) {
        super(context);
        this.i = 0;
        this.k = new AtomicBoolean(false);
        this.l = new AtomicBoolean(true);
        this.b = context;
    }

    public ipf(Context context, List<Integer> list, WidgetContentData widgetContentData, int i, ipd ipdVar) {
        super(context);
        this.i = 0;
        this.k = new AtomicBoolean(false);
        this.l = new AtomicBoolean(true);
        this.b = context;
        this.e = ipdVar;
        this.i = i;
        this.g = list;
        this.c = widgetContentData;
        this.h = widgetContentData.getId();
        this.d = new a();
        this.f = new LinkedHashMap();
        b();
        c();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (this.e != null) {
                this.e.a();
            }
            this.d.a(System.currentTimeMillis());
            new ipe(this.b, this.c, new ipc() { // from class: tb.ipf.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ipc
                public void a(Bitmap bitmap, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a1b53710", new Object[]{this, bitmap, str});
                        return;
                    }
                    try {
                        if (bitmap == null) {
                            if (ipf.a(ipf.this) == null) {
                                return;
                            }
                            ipf.a(ipf.this).a("DSL_RENDER_FAIL");
                            return;
                        }
                        ipf.b(ipf.this).b(bitmap);
                        ipf.b(ipf.this).a(JSONObject.parseArray(JSONObject.parseObject(str).getString("clickAreas"), ClickArea.class));
                        ipf.c(ipf.this).set(true);
                        long currentTimeMillis = System.currentTimeMillis() - ipf.b(ipf.this).f();
                        if (ipf.a(ipf.this) != null) {
                            ipf.a(ipf.this).a(currentTimeMillis);
                        }
                        ipf.this.a();
                    } catch (Exception e) {
                        e.printStackTrace();
                        khu.a("dslRender error: " + e);
                    }
                }

                @Override // tb.ipc
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    } else if (ipf.a(ipf.this) == null) {
                    } else {
                        ipd a2 = ipf.a(ipf.this);
                        a2.a(str + str2);
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
            khu.a("dslRender error : " + th);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            if (this.c.isAnim()) {
                List<AnimMeta> animMetas = this.c.getAnimMetas();
                if (animMetas == null || animMetas.isEmpty()) {
                    return;
                }
                for (AnimMeta animMeta : animMetas) {
                    a(animMeta.getAnimId(), animMeta.getRenderProp());
                }
                a(this.f);
                return;
            }
            a();
        } catch (Exception e) {
            khu.a("nativeRender error: " + e);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        a aVar = this.d;
        if (aVar == null || jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = aVar.d() == null ? new JSONObject() : this.d.d();
            jSONObject2.put(str, (Object) jSONObject);
            this.d.a(jSONObject2);
            if (jSONObject.getJSONObject("img") != null) {
                this.l.set(false);
                JSONObject jSONObject3 = jSONObject.getJSONObject("img");
                String string = jSONObject3.getString("url");
                if (!StringUtils.isEmpty(string)) {
                    this.f.put(str + "_img", string);
                }
                JSONArray jSONArray = jSONObject3.getJSONArray(AnimConstance.VIEW_ANIM_KEY_URLS);
                if (jSONArray != null && !jSONArray.isEmpty()) {
                    for (int i = 0; i < jSONArray.size(); i++) {
                        String str2 = str + "_" + i;
                        if (i < 10) {
                            this.f.put(str2, jSONArray.get(i));
                        }
                    }
                }
            }
            khu.a("[widgetAnim] setViewAnimData animId: " + str + ",mAnimImgMap: " + this.f);
        } catch (Exception e) {
            khu.a("[widgetAnim] setViewAnimData error: " + e.getMessage());
        }
    }

    private void a(final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            khu.b("[widgetAnim] loadViewAnimData mAnimImgMap: " + map);
            for (final String str : map.keySet()) {
                if (map.get(str) instanceof String) {
                    b.h().a(this.b).a((String) map.get(str)).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: tb.ipf.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.phenix.intf.event.a
                        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                        }

                        public boolean a(SuccPhenixEvent succPhenixEvent) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                            }
                            try {
                                map.put(str, succPhenixEvent.getDrawable().getBitmap());
                                ipf.a(ipf.this, map);
                            } catch (Exception e) {
                                Class<?> cls = getClass();
                                khu.a(cls, "loadImage error: " + e);
                            }
                            return false;
                        }
                    }).fetch();
                }
            }
        }
    }

    private void b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        for (String str : map.keySet()) {
            if (map.get(str) instanceof String) {
                return;
            }
        }
        this.l.set(true);
        a();
    }

    private void a(RemoteViews remoteViews) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e836437a", new Object[]{this, remoteViews});
            return;
        }
        try {
            if (khp.d() && remoteViews != null) {
                b(remoteViews);
                if (this.d != null && this.d.d() != null) {
                    JSONObject d = this.d.d();
                    khu.b("[widgetAnim] renderViewAnimData: " + d);
                    for (Map.Entry<String, Object> entry : d.entrySet()) {
                        String key = entry.getKey();
                        JSONObject jSONObject = (JSONObject) entry.getValue();
                        if (key.contains("frame")) {
                            if (khp.f()) {
                                a(remoteViews, key);
                            }
                        } else if (khp.e()) {
                            a(remoteViews, key, false);
                            a(remoteViews, key, jSONObject);
                        } else {
                            a(remoteViews, key, true);
                            b(remoteViews, key, jSONObject);
                        }
                    }
                }
            }
        } catch (Exception e) {
            khu.a("[widgetAnim] renderViewAnimData error: " + e.getMessage());
        }
    }

    private void a(RemoteViews remoteViews, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a44342c4", new Object[]{this, remoteViews, str});
            return;
        }
        try {
            if (this.f != null && !this.f.isEmpty()) {
                int a2 = a(AnimConstance.ANIM_ID_TAG + str);
                ArrayList<Bitmap> arrayList = new ArrayList();
                for (String str2 : this.f.keySet()) {
                    if (str2.contains(str) && (this.f.get(str2) instanceof Bitmap)) {
                        arrayList.add((Bitmap) this.f.get(str2));
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                for (Bitmap bitmap : arrayList) {
                    RemoteViews remoteViews2 = new RemoteViews(this.b.getPackageName(), R.layout.widget_anim_flipper_item);
                    remoteViews2.setImageViewBitmap(R.id.widget_flipper_item_iv, khj.a(bitmap));
                    remoteViews.addView(a2, remoteViews2);
                }
            }
        } catch (Exception e) {
            khu.a("renderFrameAnimData error: " + e);
        }
    }

    private void a(RemoteViews remoteViews, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bad60ac", new Object[]{this, remoteViews, str, jSONObject});
            return;
        }
        String str2 = AnimConstance.ANIM_TRANSLATE_BUBBLE_ID;
        if (!str.contains(str2)) {
            str2 = str;
        }
        int a2 = a(AnimConstance.ANIM_ID_TAG + str2);
        RemoteViews remoteViews2 = new RemoteViews(this.b.getPackageName(), b(AnimConstance.ANIM_ID_TAG + str2));
        remoteViews.addView(a2, remoteViews2);
        b(remoteViews2, str, jSONObject);
        khu.a("[widgetAnim] resetViewAnimData animId: " + str);
    }

    private void b(RemoteViews remoteViews, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3acbf0b", new Object[]{this, remoteViews, str, jSONObject});
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            String str2 = str + "_" + key;
            int a2 = a(str2);
            JSONObject jSONObject2 = (JSONObject) entry.getValue();
            if (key.contains("layout")) {
                a(remoteViews, a2);
            }
            if (key.contains("img") && !this.f.isEmpty() && (this.f.get(str2) instanceof Bitmap)) {
                a(remoteViews, a2, (Bitmap) this.f.get(str2));
            }
            if (key.contains("text")) {
                a(remoteViews, a2, jSONObject2.getString("text"));
                b(remoteViews, a2, jSONObject2.getString("textColor"));
                c(remoteViews, a2, jSONObject2.getString("textSize"));
            }
        }
    }

    private void a(RemoteViews remoteViews, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e425c890", new Object[]{this, remoteViews, str, new Boolean(z)});
            return;
        }
        if (str.contains(AnimConstance.ANIM_TRANSLATE_BUBBLE_ID)) {
            str = AnimConstance.ANIM_TRANSLATE_BUBBLE_ID;
        }
        int a2 = a(str + AnimConstance.ANIM_LAYOUT_TAG);
        if (a2 <= 0) {
            return;
        }
        if (z) {
            a(remoteViews, a2);
        } else {
            c(remoteViews, a2);
        }
    }

    private void b(RemoteViews remoteViews) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("660dff7b", new Object[]{this, remoteViews});
            return;
        }
        for (String str : AnimConstance.ANIM_IDS) {
            for (String str2 : AnimConstance.ANIM_VIEW_IDS) {
                int a2 = a(str + "_" + str2);
                if (a2 > 0) {
                    c(remoteViews, a2);
                }
            }
            int a3 = a(AnimConstance.ANIM_ID_TAG + str);
            if (a3 > 0) {
                remoteViews.removeAllViews(a3);
            }
        }
    }

    public void a() {
        RemoteViews d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (!this.k.get() || !this.l.get() || this.d == null || (d = d()) == null) {
                return;
            }
            a(d, R.id.ditto_back_pic, this.d.a());
            a(d, R.id.ditto_core_pic, this.d.b());
            if (this.d.c() != null) {
                a(d, this.d.c(), this.g);
            }
            a(d);
            for (Integer num : this.g) {
                AppWidgetManager.getInstance(this.b).updateAppWidget(num.intValue(), d);
            }
            long currentTimeMillis = System.currentTimeMillis() - this.d.f();
            g.a(this.b).a(this.h, this.c.getNextRefreshTime() * 1000);
            if (this.e == null) {
                return;
            }
            this.e.b(currentTimeMillis);
        } catch (Throwable th) {
            khu.a("updateAppWidget error：" + th.getMessage());
        }
    }

    private RemoteViews d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteViews) ipChange.ipc$dispatch("74d6d25d", new Object[]{this});
        }
        int i = this.i;
        if (i == 0) {
            this.j = new RemoteViews(this.b.getPackageName(), R.layout.widget_ditto_dynamic_mini);
        } else if (i == 1) {
            this.j = new RemoteViews(this.b.getPackageName(), R.layout.widget_ditto_dynamic_small);
        } else if (i == 2) {
            this.j = new RemoteViews(this.b.getPackageName(), R.layout.widget_ditto_dynamic_normal);
        }
        return this.j;
    }
}
