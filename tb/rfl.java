package tb;

import android.os.Process;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.update.framework.d;
import java.util.Iterator;
import tb.rfz;

/* loaded from: classes9.dex */
public class rfl extends d implements rfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f33115a = false;

    static {
        kge.a(1684840776);
        kge.a(-108454860);
    }

    public static /* synthetic */ Object ipc$super(rfl rflVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.update.framework.d
    public boolean doUpdate(JSONObject jSONObject, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14471eed", new Object[]{this, jSONObject, new Boolean(z), str})).booleanValue();
        }
        return false;
    }

    @Override // tb.rfz
    public void patchProcessListener(rfz.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d0ecef", new Object[]{this, aVar});
        }
    }

    public rfl() {
        rfy.getInstance().registerListener("cmd", this);
    }

    @Override // tb.rfz
    public void onUpdate(boolean z, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ba63f5", new Object[]{this, new Boolean(z), jSONObject, str});
            return;
        }
        rfy.getInstance().invalidUpdateInfo("cmd");
        try {
            Iterator<Object> it = jSONObject.getJSONArray("cmds").iterator();
            while (it.hasNext()) {
                if (((JSONObject) it.next()).containsValue(DMComponent.RESET)) {
                    this.f33115a = true;
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.update.framework.d
    public void onBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[]{this});
        } else {
            a();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f33115a) {
        } else {
            this.f33115a = false;
            Process.killProcess(Process.myPid());
        }
    }

    @Override // com.taobao.update.framework.d
    public void onExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
        } else {
            a();
        }
    }
}
