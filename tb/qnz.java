package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;

/* loaded from: classes.dex */
public class qnz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f32970a = "";

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static qnz f32971a;

        static {
            kge.a(1321476229);
            f32971a = new qnz();
        }

        public static /* synthetic */ qnz a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (qnz) ipChange.ipc$dispatch("f09aec1", new Object[0]) : f32971a;
        }
    }

    static {
        kge.a(-1616503886);
    }

    public static qnz a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qnz) ipChange.ipc$dispatch("f09aec1", new Object[0]) : a.a();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.f32970a)) {
            this.f32970a = UTDevice.getUtdid(PopLayer.getReference().getApp());
        }
        return this.f32970a;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            com.taobao.tbpoplayer.info.a.a().e();
        }
    }

    public boolean a(String str, BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0b1e2e8", new Object[]{this, str, baseConfigItem})).booleanValue() : com.taobao.tbpoplayer.info.a.a().a(str, baseConfigItem);
    }

    public boolean a(String str, BaseConfigItem baseConfigItem, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("658b2c74", new Object[]{this, str, baseConfigItem, new Boolean(z)})).booleanValue() : com.taobao.tbpoplayer.info.a.a().a(str, baseConfigItem, z);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : com.taobao.tbpoplayer.info.a.a().f();
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : com.taobao.tbpoplayer.info.a.a().c(str);
    }
}
