package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class spy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_ALBUM_DETAIL = "album_detail";
    public static final String BIZ_BG_INTERACT = "bg_interact";
    public static final String BIZ_COMMENT_LIST = "commentlist";
    public static final String BIZ_DEBUG = "debug";
    public static final String BIZ_GOODS_LIST = "goodslist";
    public static final String BIZ_INTERACT = "interact";
    public static final String BIZ_OPEN_INTERACT = "open_interact";
    public static final String BIZ_SHORTVIDEO_CARD = "shortvideo_card";
    public static final String BIZ_SHORTVIDEO_GLOBAL = "shortvideo_global";
    public static final String BIZ_SHORTVIDEO_GLOBAL_DX = "shortvideo_global_dx";
    public static final String BIZ_SHORTVIDEO_GLOBAL_FLOAT = "shortvideo_global_float";
    public static final String BIZ_SHORTVIDEO_GLOBAL_H5 = "shortvideo_global_h5";
    public static final String BIZ_TNODE_HOME = "tnode_home";
    public static final String FROM_GG_HOME = "gg_home";
    public static final String FROM_NATIVE = "native";
    public static final String FROM_TNODE = "tnode";
    public static final String FROM_WEEX = "weex";
    public static final String KEY_ARGS = "args";
    public static final String KEY_ARGS_SIZE = "argsSize";
    public static final String KEY_BIZ_SCENE = "bizscene";
    public static final String KEY_CALLBACK = "callback";
    public static final String KEY_FROM = "from";
    public static final String KEY_ID = "id";
    public static final String KEY_NAME = "name";
    public static final String KEY_TARGET = "target";
    public static final String KEY_TIMESTAMP = "timestamp";
    public static final String MSG_DATA_CHANGE = "VSMSG_updateMediaData";
    public static final String MSG_HIDE_TABBAR = "VSMSG_ShowBackAndHideBottomTabbar";
    public static final String MSG_SHOW_TABBAR = "VSMSG_HideBackAndShowBottomTabbar";
    public static final String MSG_UPDATE_ALBUM_DETAIL = "VSMSG_updateAlbumDetail";

    /* renamed from: a  reason: collision with root package name */
    public final String f33836a;
    public final String b;
    public final String c;
    public final String d;
    public final Object e;
    public final long f;
    public final a g;
    public final String h;
    public Map i;

    static {
        kge.a(-1473326008);
    }

    public spy(String str, String str2, Map map) {
        this(BIZ_SHORTVIDEO_CARD, "native", str, str2, null, map, null);
    }

    public spy(String str, String str2, Map map, a aVar) {
        this(BIZ_SHORTVIDEO_CARD, "native", str, str2, null, map, aVar);
    }

    public spy(String str, String str2, String str3, String str4, Object obj, Map map, a aVar) {
        this.h = "1";
        this.f33836a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = obj;
        if (str3.equals(MSG_DATA_CHANGE) || str3.equals(MSG_UPDATE_ALBUM_DETAIL)) {
            this.i = map;
        } else if (map != null) {
            this.i = new HashMap(map);
        } else {
            this.i = null;
        }
        this.f = System.currentTimeMillis();
        this.g = aVar;
        if (aVar != null) {
            a.a(aVar, this);
        }
    }

    public spy(Map map, a aVar) {
        this.h = "1";
        this.f33836a = oec.a(map.get(KEY_BIZ_SCENE), (String) null);
        this.b = oec.a(map.get("from"), (String) null);
        this.c = oec.a(map.get("name"), (String) null);
        this.d = oec.a(map.get("id"), (String) null);
        this.e = map.get("target");
        Object obj = map.get("args");
        if (obj != null) {
            if (obj instanceof Map) {
                this.i = (Map) obj;
            } else {
                this.i = JSONObject.parseObject(obj.toString());
            }
        } else {
            this.i = null;
        }
        this.f = oec.a(map.get("timestamp"), 0L);
        this.g = aVar;
        if (aVar != null) {
            a.a(aVar, this);
        }
    }

    public Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(KEY_BIZ_SCENE, this.f33836a);
        hashMap.put("from", this.b);
        hashMap.put("name", this.c);
        hashMap.put("id", this.d);
        Object obj = this.e;
        if (obj != null) {
            hashMap.put("target", obj);
        }
        hashMap.put("args", this.i);
        hashMap.put("timestamp", Long.valueOf(this.f));
        hashMap.put(FluidSDK.FLUID_SDK_FLAG, "1");
        return hashMap;
    }

    public Map b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(KEY_BIZ_SCENE, this.f33836a);
        hashMap.put("from", this.b);
        hashMap.put("name", this.c);
        hashMap.put("id", this.d);
        Object obj = this.e;
        if (obj != null) {
            hashMap.put("target", obj);
        }
        hashMap.put("timestamp", Long.valueOf(this.f));
        hashMap.put(FluidSDK.FLUID_SDK_FLAG, "1");
        return hashMap;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.c + "_" + this.f33836a + "_" + this.b + "_" + this.d + "_" + this.f + "_isFluidSDK_";
    }

    /* loaded from: classes5.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private spx f33837a;
        private spy b;

        static {
            kge.a(85826881);
        }

        public static /* synthetic */ spy a(a aVar, spy spyVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (spy) ipChange.ipc$dispatch("66c88bf7", new Object[]{aVar, spyVar});
            }
            aVar.b = spyVar;
            return spyVar;
        }

        public boolean a(spx spxVar, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f6528ddd", new Object[]{this, spxVar, obj})).booleanValue();
            }
            if (this.f33837a == null) {
                this.f33837a = spxVar;
                return true;
            }
            spz.c("MessageCenter", "sendMessage: " + ("Callback消息已经被" + this.f33837a.getClass().getSimpleName() + "处理, 忽略当前Handler: " + spxVar.getClass().getSimpleName() + " Message:" + JSON.toJSONString(this.b)));
            return false;
        }
    }
}
