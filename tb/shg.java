package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.ab;

/* loaded from: classes5.dex */
public class shg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f33578a;

    static {
        kge.a(-2069056675);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f33578a != null) {
        } else {
            n();
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : a.a(f33578a);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : a.d(f33578a);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : a.e(f33578a);
    }

    private static void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[0]);
            return;
        }
        int intValue = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().w().a(ab.a()).getIntValue("deviceLevel");
        String str = intValue == 0 ? "ShortVideo.weexV2CheckMsgPileConfig_h_v2" : intValue == 1 ? "ShortVideo.weexV2CheckMsgPileConfig_m_v2" : "ShortVideo.weexV2CheckMsgPileConfig_l_v2";
        f33578a = new a();
        String a2 = oeb.a(str, (String) null);
        if (!TextUtils.isEmpty(a2)) {
            JSONObject parseObject = JSON.parseObject(a2);
            if (parseObject == null) {
                return;
            }
            a.a(f33578a, oec.a((Object) parseObject.getString("needRebuildWeex"), true));
            a.b(f33578a, oec.a((Object) parseObject.getString("rebuildWeexImmediately"), true));
            a.c(f33578a, oec.a((Object) parseObject.getString("rebuildThread"), true));
            a.d(f33578a, oec.a((Object) parseObject.getString("rebuildWeexWhenJSException"), true));
            a.e(f33578a, oec.a((Object) parseObject.getString("checkInstance"), true));
            a.a(f33578a, oec.a((Object) parseObject.getString("checkInterval"), 0));
            a.b(f33578a, oec.a((Object) parseObject.getString("singlePingCostThrehold"), 0.4f));
            a.c(f33578a, oec.a((Object) parseObject.getString("levelOneTimeout"), 0.6f));
            a.a(f33578a, oec.b(parseObject.getString("levelTwoTimeout"), 5));
            a.c(f33578a, oec.a((Object) parseObject.getString("pingCount"), 3));
            a.b(f33578a, oec.a((Object) parseObject.getString("threadCount"), 3));
        }
        spz.c("WeexThreadOrangeHelper", "CardWeeXV2MessageHandler getWeexV2CheckMsgPileConfig " + f33578a.toString());
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean b = true;
        private boolean c = true;
        private boolean d = true;
        private boolean e = true;
        private boolean f = true;
        private int g = 0;
        private float h = 0.4f;
        private float i = 0.6f;
        private float j = 5.0f;
        private int k = 3;
        private int l = 3;

        static {
            kge.a(1073562303);
        }

        public static /* synthetic */ float a(a aVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6681e547", new Object[]{aVar, new Float(f)})).floatValue();
            }
            aVar.j = f;
            return f;
        }

        public static /* synthetic */ int a(a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6681f08d", new Object[]{aVar, new Integer(i)})).intValue();
            }
            aVar.g = i;
            return i;
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d1cf38d", new Object[]{aVar})).booleanValue() : aVar.b;
        }

        public static /* synthetic */ boolean a(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6682306f", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.b = z;
            return z;
        }

        public static /* synthetic */ float b(a aVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4813c326", new Object[]{aVar, new Float(f)})).floatValue();
            }
            aVar.h = f;
            return f;
        }

        public static /* synthetic */ int b(a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4813ce6c", new Object[]{aVar, new Integer(i)})).intValue();
            }
            aVar.l = i;
            return i;
        }

        public static /* synthetic */ boolean b(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("48140e4e", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.c = z;
            return z;
        }

        public static /* synthetic */ float c(a aVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("29a5a105", new Object[]{aVar, new Float(f)})).floatValue();
            }
            aVar.i = f;
            return f;
        }

        public static /* synthetic */ int c(a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("29a5ac4b", new Object[]{aVar, new Integer(i)})).intValue();
            }
            aVar.k = i;
            return i;
        }

        public static /* synthetic */ boolean c(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("29a5ec2d", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.d = z;
            return z;
        }

        public static /* synthetic */ boolean d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4aaf3250", new Object[]{aVar})).booleanValue() : aVar.e;
        }

        public static /* synthetic */ boolean d(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b37ca0c", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.e = z;
            return z;
        }

        public static /* synthetic */ boolean e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a48a9c91", new Object[]{aVar})).booleanValue() : aVar.f;
        }

        public static /* synthetic */ boolean e(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ecc9a7eb", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.f = z;
            return z;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "OrangeData{needRebuildWeex=" + this.b + ", rebuildWeexImmediately=" + this.c + ", rebuildThread=" + this.d + ", rebuildWeexWhenJSException=" + this.e + ", checkInstance=" + this.f + ", checkInterval=" + this.g + ", singlePingCostThrehold=" + this.h + ", levelOneTimeout=" + this.i + ", levelTwoTimeout=" + this.j + ", pingCount=" + this.k + ", threadCount=" + this.l + '}';
        }
    }
}
