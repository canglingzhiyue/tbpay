package com.taobao.android.fluid.framework.hostcontainer.tnode.component;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.hostcontainer.tnode.ProgressViewGroup;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oec;
import tb.ogl;

/* loaded from: classes5.dex */
public class FullPageAlbumSliderComponent extends Component<ProgressViewGroup, a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes5.dex */
    public static class IndicatorModel implements Serializable {
        public int count;
        public double interval;

        static {
            kge.a(-1243881367);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(972095125);
    }

    public static /* synthetic */ Object ipc$super(FullPageAlbumSliderComponent fullPageAlbumSliderComponent, String str, Object... objArr) {
        if (str.hashCode() == -2141646649) {
            super.applyAttrForView((View) objArr[0], (ogl) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ void applyAttrForView(ProgressViewGroup progressViewGroup, a aVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805910c7", new Object[]{this, progressViewGroup, aVar, map, new Boolean(z)});
        } else {
            a(progressViewGroup, aVar, map, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [tb.ogl, com.taobao.android.fluid.framework.hostcontainer.tnode.component.FullPageAlbumSliderComponent$a] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ a mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View, com.taobao.android.fluid.framework.hostcontainer.tnode.ProgressViewGroup] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ ProgressViewGroup onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : a(context);
    }

    public static /* synthetic */ void a(FullPageAlbumSliderComponent fullPageAlbumSliderComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b47119f", new Object[]{fullPageAlbumSliderComponent, new Integer(i)});
        } else {
            fullPageAlbumSliderComponent.a(i);
        }
    }

    public void a(final ProgressViewGroup progressViewGroup, final a aVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77296d5c", new Object[]{this, progressViewGroup, aVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(progressViewGroup, aVar, map, z);
        if (progressViewGroup == null || aVar == null || aVar.f12575a == null) {
            return;
        }
        if (!z && (map == null || map.size() <= 0)) {
            return;
        }
        int i = aVar.f12575a.count;
        progressViewGroup.setInterval((long) (aVar.f12575a.interval * 1000.0d));
        progressViewGroup.setOnItemClickListener(new ProgressViewGroup.a() { // from class: com.taobao.android.fluid.framework.hostcontainer.tnode.component.FullPageAlbumSliderComponent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.framework.hostcontainer.tnode.ProgressViewGroup.a
            public void a(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                    return;
                }
                FullPageAlbumSliderComponent.a(FullPageAlbumSliderComponent.this, i2);
                if (aVar.d) {
                    progressViewGroup.selectIndex(i2, true);
                } else {
                    progressViewGroup.startProgress(i2);
                }
            }
        });
        progressViewGroup.buildChildren(i);
        if (aVar.d) {
            progressViewGroup.selectIndex(aVar.c, true);
        } else if (aVar.b) {
            progressViewGroup.startProgress(aVar.c);
        } else if (map != null && map.containsKey("selectindex")) {
            progressViewGroup.selectIndex(aVar.c, false);
        } else {
            progressViewGroup.pauseProgress();
        }
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("786c14c7", new Object[]{this}) : new a();
    }

    public ProgressViewGroup a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProgressViewGroup) ipChange.ipc$dispatch("6a615450", new Object[]{this, context}) : new ProgressViewGroup(context);
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.node == null || ((String) this.node.e("onselectchange")) == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("position", String.valueOf(i));
            sendMessage(this.node, "onselectchange", null, hashMap, null);
        }
    }

    /* loaded from: classes5.dex */
    public static class a extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public IndicatorModel f12575a;
        public boolean b;
        public int c;
        public boolean d;
        public String e = "承接";

        static {
            kge.a(-1781523813);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -2079543418) {
                super.a((Context) objArr[0], (String) objArr[1], objArr[2]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // tb.ogl
        public void a(Context context, String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("840caf86", new Object[]{this, context, str, obj});
                return;
            }
            super.a(context, str, obj);
            char c = 65535;
            try {
                switch (str.hashCode()) {
                    case -1162090388:
                        if (str.equals("testsence")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 224506198:
                        if (str.equals("selectindex")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 268913850:
                        if (str.equals("initdata")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 1439562083:
                        if (str.equals("autoplay")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1985535473:
                        if (str.equals("setfull")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    if (!(obj instanceof JSONObject)) {
                        return;
                    }
                    this.f12575a = (IndicatorModel) JSON.parseObject(((JSONObject) obj).toJSONString(), IndicatorModel.class);
                } else if (c == 1) {
                    this.b = oec.a(obj, false);
                } else if (c == 2) {
                    this.d = oec.a(obj, false);
                } else if (c != 3) {
                    if (c != 4) {
                        return;
                    }
                    this.e = (String) obj;
                } else if (!(obj instanceof String)) {
                } else {
                    this.c = Integer.parseInt((String) obj);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
