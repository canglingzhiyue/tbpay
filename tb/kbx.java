package tb;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.Tracer.c;
import com.taobao.taobaoavsdk.e;
import com.taobao.taobaoavsdk.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public class kbx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f29951a;
    private String b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g = 0.0f;
    private float h = 0.0f;
    private kbw i;
    private ScaleGestureDetector j;
    private GestureDetector k;
    private Context l;
    private List<e> m;
    private boolean n;
    private kbv o;

    static {
        kge.a(1032301023);
    }

    public static /* synthetic */ float a(kbx kbxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f0c80527", new Object[]{kbxVar})).floatValue() : kbxVar.c;
    }

    public static /* synthetic */ float b(kbx kbxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("df4b0ba8", new Object[]{kbxVar})).floatValue() : kbxVar.g;
    }

    public static /* synthetic */ float c(kbx kbxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cdce1229", new Object[]{kbxVar})).floatValue() : kbxVar.h;
    }

    public static /* synthetic */ kbw d(kbx kbxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kbw) ipChange.ipc$dispatch("1fe8fa8c", new Object[]{kbxVar}) : kbxVar.i;
    }

    public kbx(Context context, String str, kbw kbwVar, kbv kbvVar) {
        this.f29951a = 0;
        this.c = 85.0f;
        this.d = 95.0f;
        this.e = 25.0f;
        this.f = 0.001f;
        this.b = str;
        this.f29951a = "ERP".equals(str) ? 1 : 2;
        this.i = kbwVar;
        this.l = context;
        this.o = kbvVar;
        this.j = new ScaleGestureDetector(context, new b());
        this.k = new GestureDetector(context, new a());
        this.c = g();
        this.d = h();
        this.e = i();
        this.f = j();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.l = null;
        this.j = null;
        this.k = null;
        this.o = null;
        this.i = null;
        this.m = null;
    }

    public HashMap<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("FOV", "" + this.c);
        hashMap.put("latitude", "" + this.g);
        hashMap.put("longitude", "" + this.h);
        return hashMap;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f29951a;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONArray jSONArray = jSONObject.getJSONArray("array");
            int size = jSONArray == null ? 0 : jSONArray.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                try {
                    JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                    if (jSONObject2 != null) {
                        e eVar = new e();
                        eVar.f21337a = jSONObject2.getString("id");
                        eVar.b = jSONObject2.getFloat("latitude").floatValue();
                        eVar.c = jSONObject2.getFloat("longitude").floatValue();
                        arrayList.add(eVar);
                    }
                } catch (JSONException e) {
                    AVSDKLog.e(c.MODULE_SDK_PAGE, e.toString());
                }
            }
            if (arrayList.size() <= 0) {
                return;
            }
            a(arrayList);
        }
    }

    private void a(List<e> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.m = list;
        this.n = true;
        e();
    }

    /* loaded from: classes6.dex */
    public class b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(44452345);
        }

        private b() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e2015504", new Object[]{this, scaleGestureDetector})).booleanValue();
            }
            if (scaleGestureDetector == null) {
                return false;
            }
            float a2 = kbx.a(kbx.this) / scaleGestureDetector.getScaleFactor();
            kbx kbxVar = kbx.this;
            kbxVar.a(a2, kbx.b(kbxVar), kbx.c(kbx.this), true);
            AVSDKLog.e(c.MODULE_SDK_PAGE, "onScale " + scaleGestureDetector.getScaleFactor());
            return true;
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            Object obj = jSONObject.get("FOV");
            Object obj2 = jSONObject.get("latitude");
            Object obj3 = jSONObject.get("longitude");
            if (obj == null || obj2 == null || obj3 == null) {
                return;
            }
            a(com.taobao.taobaoavsdk.util.b.d(String.valueOf(obj)), com.taobao.taobaoavsdk.util.b.d(String.valueOf(obj2)), com.taobao.taobaoavsdk.util.b.d(String.valueOf(obj3)), true);
        }
    }

    public void a(float f, float f2, float f3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cc337c", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Boolean(z)});
        } else if (!z) {
        } else {
            if (Math.abs(f - this.c) < this.f && Math.abs(f2 - this.g) < this.f && Math.abs(f3 - this.h) < this.f) {
                return;
            }
            if (Math.abs(1.0f + f) < 1.0E-8d) {
                f = this.c;
            }
            this.c = Math.max(this.e, Math.min(f, this.d));
            this.g = f2 % 180.0f;
            this.h = f3 % 360.0f;
            this.n = true;
            this.i.setFov(this.c, this.g, this.h);
            this.i.refreshScreen();
        }
    }

    /* loaded from: classes6.dex */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1046993864);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != 307521857) {
                if (hashCode != 2050069395) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                return new Boolean(super.onDoubleTap((MotionEvent) objArr[0]));
            }
            return new Boolean(super.onScroll((MotionEvent) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
        }

        private a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
            }
            float width = (f / kbx.d(kbx.this).getWidth()) * kbx.a(kbx.this);
            float height = (f2 / kbx.d(kbx.this).getHeight()) * kbx.a(kbx.this);
            kbx kbxVar = kbx.this;
            kbxVar.a(kbx.a(kbxVar), kbx.b(kbx.this) - height, kbx.c(kbx.this) + width, true);
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue() : super.onDoubleTap(motionEvent);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.n) {
            this.n = false;
            List<e> list = this.m;
            if (list == null || list.size() == 0) {
                return;
            }
            new ArrayList();
            List<f> hitTest = this.i.hitTest(this.m);
            if (hitTest == null) {
                return;
            }
            JSONArray jSONArray = new JSONArray();
            for (f fVar : hitTest) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", (Object) fVar.f21338a.f21337a);
                jSONObject.put("latitude", (Object) Float.valueOf(fVar.f21338a.b));
                jSONObject.put("longitude", (Object) Float.valueOf(fVar.f21338a.c));
                jSONObject.put("screen_x", (Object) Float.valueOf(fVar.b));
                jSONObject.put("screen_y", (Object) Float.valueOf(fVar.c));
                jSONArray.add(jSONObject);
            }
            this.o.onAnchorListUpdate(jSONArray);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("FOV", "" + this.c);
        hashMap.put("latitude", "" + this.g);
        hashMap.put("longitude", "" + this.h);
        this.o.onFovChange(hashMap);
        this.n = true;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        f();
        e();
    }

    private float g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f95e", new Object[]{this})).floatValue() : com.taobao.taobaoavsdk.util.b.d(OrangeConfig.getInstance().getConfig("DWInteractive", "PanoERPDefaultFov", "85.0"));
    }

    private float h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10df", new Object[]{this})).floatValue() : com.taobao.taobaoavsdk.util.b.d(OrangeConfig.getInstance().getConfig("DWInteractive", "PanoERPMaxFov", "95.0"));
    }

    private float i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2860", new Object[]{this})).floatValue() : com.taobao.taobaoavsdk.util.b.d(OrangeConfig.getInstance().getConfig("DWInteractive", "PanoERPMinFov", "25.0"));
    }

    private float j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe1", new Object[]{this})).floatValue() : com.taobao.taobaoavsdk.util.b.d(OrangeConfig.getInstance().getConfig("DWInteractive", "PanoFovChange", "0.01"));
    }

    public boolean a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
        }
        ScaleGestureDetector scaleGestureDetector = this.j;
        if (scaleGestureDetector != null && this.k != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
            if (!this.j.isInProgress()) {
                this.k.onTouchEvent(motionEvent);
            }
        }
        return true;
    }
}
