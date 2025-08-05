package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.i;
import com.taobao.tao.flexbox.layoutmanager.container.m;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import java.util.Map;

/* loaded from: classes5.dex */
public class gvv extends i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1491044677);
    }

    public static /* synthetic */ Object ipc$super(gvv gvvVar, String str, Object... objArr) {
        if (str.hashCode() == 691625481) {
            return new Boolean(super.a((TNodeView) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.i
    public void a(Context context, TNodeView tNodeView, Object obj, m.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abedc124", new Object[]{this, context, tNodeView, obj, bVar});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.i
    public void a(Context context, aa aaVar, String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41dc10a9", new Object[]{this, context, aaVar, str, str2, map});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.i
    public void a(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1434fc3c", new Object[]{this, context, obj});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.i
    public void a(Context context, Object obj, Object obj2, m.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d64f513", new Object[]{this, context, obj, obj2, bVar});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.i
    public void a(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691d3050", new Object[]{this, aaVar});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.i
    public void b(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dff9e1b", new Object[]{this, context, obj});
        }
    }

    public gvv(m.b bVar) {
        super(bVar);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.i
    public boolean a(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29395e09", new Object[]{this, tNodeView})).booleanValue();
        }
        try {
            if (super.a(tNodeView) && this.f != null) {
                if (this.f.f()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
