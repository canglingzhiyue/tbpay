package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbmobilesmartapi.core.SceneContext;
import com.taobao.tbmobilesmartapi.core.a;
import com.taobao.tbmobilesmartapi.core.b;

/* loaded from: classes8.dex */
public class svm implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SceneContext f33923a;

    static {
        kge.a(-1530285448);
        kge.a(821569461);
    }

    public <T extends a> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7f82be24", new Object[]{this, cls});
        }
        return null;
    }

    @Override // com.taobao.tbmobilesmartapi.core.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public void a(SceneContext sceneContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("813e4861", new Object[]{this, sceneContext});
        }
    }

    @Override // com.taobao.tbmobilesmartapi.core.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // com.taobao.tbmobilesmartapi.core.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.taobao.tbmobilesmartapi.core.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    public boolean putServicesInstance(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb03c310", new Object[]{this, aVar})).booleanValue();
        }
        return false;
    }

    public void releaseSceneContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf94c8b1", new Object[]{this});
        }
    }

    public static svm b(SceneContext sceneContext) {
        svm svmVar;
        try {
            svmVar = (svm) Class.forName("com.taobao.tbmobilesmart.core.MobileAIContext").newInstance();
        } catch (Throwable unused) {
            svmVar = null;
        }
        if (svmVar == null) {
            svmVar = new svm();
        }
        svmVar.a(sceneContext);
        return svmVar;
    }
}
