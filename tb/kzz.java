package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.event.IPopMessageListener;
import com.taobao.homepage.pop.protocol.event.IPopViewEventListener;
import com.taobao.homepage.pop.protocol.event.a;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.c;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class kzz implements IPopMessageListener, IPopViewEventListener, a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Set<IPopViewEventListener> f30429a = new CopyOnWriteArraySet();
    private Set<IPopMessageListener> b = new CopyOnWriteArraySet();
    private Set<a> c = new CopyOnWriteArraySet();

    public void a(IPopViewEventListener iPopViewEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31226556", new Object[]{this, iPopViewEventListener});
        } else if (iPopViewEventListener == null) {
        } else {
            this.f30429a.add(iPopViewEventListener);
        }
    }

    public void b(IPopViewEventListener iPopViewEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3e117", new Object[]{this, iPopViewEventListener});
        } else if (iPopViewEventListener == null) {
        } else {
            this.f30429a.remove(iPopViewEventListener);
        }
    }

    public void a(IPopMessageListener iPopMessageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b349ec4", new Object[]{this, iPopMessageListener});
        } else if (iPopMessageListener == null) {
        } else {
            this.b.add(iPopMessageListener);
        }
    }

    public void b(IPopMessageListener iPopMessageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f416c5", new Object[]{this, iPopMessageListener});
        } else if (iPopMessageListener == null) {
        } else {
            this.b.remove(iPopMessageListener);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce75cd6", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.c.add(aVar);
        }
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2618317", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.c.remove(aVar);
        }
    }

    @Override // com.taobao.homepage.pop.protocol.event.IPopViewEventListener
    public void onEvent(int i, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b090649f", new Object[]{this, new Integer(i), iPopData});
            return;
        }
        for (IPopViewEventListener iPopViewEventListener : this.f30429a) {
            try {
                iPopViewEventListener.onEvent(i, iPopData);
            } catch (Throwable th) {
                c.a("trigger onEvent error", th);
            }
        }
    }

    @Override // com.taobao.homepage.pop.protocol.event.IPopMessageListener
    public void onMessage(String str, IPopData iPopData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9b3eda9", new Object[]{this, str, iPopData, jSONObject});
            return;
        }
        for (IPopMessageListener iPopMessageListener : this.b) {
            try {
                iPopMessageListener.onMessage(str, iPopData, jSONObject);
            } catch (Throwable th) {
                c.a("trigger onMessage error", th);
            }
        }
    }

    @Override // com.taobao.homepage.pop.protocol.event.a
    public void a(View view, IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("464c2516", new Object[]{this, view, iPopData});
            return;
        }
        for (a aVar : this.c) {
            try {
                aVar.a(view, iPopData);
            } catch (Throwable th) {
                c.a("onPopViewUpdate error", th);
            }
        }
    }

    @Override // com.taobao.homepage.pop.protocol.event.a
    public void b(View view, IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471aa397", new Object[]{this, view, iPopData});
            return;
        }
        for (a aVar : this.c) {
            try {
                aVar.b(view, iPopData);
            } catch (Throwable th) {
                c.a("onPopViewUpdate error", th);
            }
        }
    }
}
