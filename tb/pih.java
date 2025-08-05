package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.utils.q;

/* loaded from: classes8.dex */
public class pih implements ddy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f32681a;
    private TBLiveDataModel b;
    private a c;

    static {
        kge.a(-278983155);
        kge.a(1284369743);
    }

    public pih(Context context, TBLiveDataModel tBLiveDataModel, a aVar) {
        this.f32681a = context;
        this.b = tBLiveDataModel;
        this.c = aVar;
    }

    @Override // tb.ddy
    public BaseFrame a(String str) {
        Class<? extends BaseFrame> a2 = pij.a(str);
        if (a2 != null) {
            try {
                return a2.getConstructor(Context.class, Boolean.TYPE, TBLiveDataModel.class, a.class).newInstance(this.f32681a, Boolean.valueOf(this.c.b), this.b, this.c);
            } catch (Exception e) {
                q.b("LegacyFrameFactory", "create error : " + e.getMessage());
                return null;
            }
        }
        q.b("LegacyFrameFactory", "请使用LegacyFrameRegistry.registerFrame注册组件");
        return null;
    }
}
