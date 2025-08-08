package tb;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.utils.o;
import com.taobao.taolive.sdk.goodlist.f;
import com.taobao.taolive.sdk.goodlist.h;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.utils.l;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class pfh implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private f f32585a;
    private pfb b;
    private a c;

    static {
        kge.a(986330311);
        kge.a(346971100);
    }

    public static /* synthetic */ f a(pfh pfhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("d981673c", new Object[]{pfhVar}) : pfhVar.f32585a;
    }

    public pfh(Activity activity, a aVar, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view) {
        this.c = aVar;
        this.f32585a = com.taobao.android.live.plugin.proxy.f.m().createGoodFrameKandian(activity, str, z, tBLiveDataModel, view, aVar);
        this.f32585a.setFrameEventListener(this);
        this.b = pfb.a(this.c);
        c();
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else {
            this.f32585a.setContainer((ViewGroup) viewGroup.findViewById(R.id.taolive_goods_list_dx_container), (ViewGroup) viewGroup.findViewById(R.id.taolive_goods_list_itemgroup_container));
        }
    }

    public BaseFrame a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("7f374ae2", new Object[]{this}) : this.f32585a.getFrame();
    }

    @Override // com.taobao.taolive.sdk.goodlist.h
    public void a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd977ce1", new Object[]{this, tBLiveDataModel});
        } else {
            c();
        }
    }

    @Override // com.taobao.taolive.sdk.goodlist.h
    public void a(boolean z, HashMap<String, String> hashMap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf4d1", new Object[]{this, new Boolean(z), hashMap, str});
            return;
        }
        HashMap hashMap2 = new HashMap();
        if (!StringUtils.isEmpty(str)) {
            hashMap2.put("glopenfrom", str);
        }
        o.a(this.c, "Goodslist", (Map<String, String>) hashMap2);
        if (this.b.l() != null) {
            this.b.l().n(this.c, true);
            this.b.l().l(this.c, "goodsList");
        }
        new HashMap().put("isOpen", "true");
        pfc.a();
    }

    @Override // com.taobao.taolive.sdk.goodlist.h
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.b.l() != null) {
            this.b.l().n(this.c, false);
            this.b.l().c(this.c);
        }
        new HashMap().put("isOpen", "false");
        pfc.a();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b.a(new pfi() { // from class: tb.pfh.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // tb.pfi
                public void a(Object obj) {
                    HashMap hashMap;
                    boolean z;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                        return;
                    }
                    if (obj == null || !(obj instanceof HashMap)) {
                        hashMap = null;
                        z = false;
                    } else {
                        HashMap hashMap2 = (HashMap) obj;
                        hashMap = hashMap2;
                        z = l.d((String) hashMap2.get("show_item_group"));
                    }
                    pfh.a(pfh.this).show(z, hashMap, 0L, false);
                }

                @Override // tb.pfi
                public void b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                    } else {
                        pfh.a(pfh.this).hide();
                    }
                }
            });
        }
    }
}
