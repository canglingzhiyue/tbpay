package com.taobao.wireless.security.sdk.initialize;

import android.content.Context;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.initialize.IInitializeComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.security.sdk.initialize.IInitializeComponent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import tb.kge;

/* loaded from: classes.dex */
public class a implements IInitializeComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Set<C1022a> f23629a = new HashSet();
    private Object b = new Object();

    /* renamed from: com.taobao.wireless.security.sdk.initialize.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public class C1022a implements IInitializeComponent.IInitFinishListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public IInitializeComponent.IInitFinishListener f23630a;

        static {
            kge.a(1378872645);
            kge.a(-827346599);
        }

        public C1022a(a aVar, IInitializeComponent.IInitFinishListener iInitFinishListener) {
            this.f23630a = iInitFinishListener;
        }

        @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent.IInitFinishListener
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
            } else {
                this.f23630a.onError();
            }
        }

        @Override // com.alibaba.wireless.security.open.initialize.IInitializeComponent.IInitFinishListener
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                this.f23630a.onSuccess();
            }
        }
    }

    static {
        kge.a(-123704696);
        kge.a(1981700797);
    }

    @Override // com.taobao.wireless.security.sdk.initialize.IInitializeComponent
    public int initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1dcfb84", new Object[]{this, context})).intValue();
        }
        try {
            return SecurityGuardManager.getInitializer().initialize(context);
        } catch (SecException e) {
            e.printStackTrace();
            return 1;
        }
    }

    @Override // com.taobao.wireless.security.sdk.initialize.IInitializeComponent
    public synchronized void initializeAsync(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a6a1fd5", new Object[]{this, context});
        } else {
            SecurityGuardManager.getInitializer().initializeAsync(context);
        }
    }

    @Override // com.taobao.wireless.security.sdk.initialize.IInitializeComponent
    public boolean isSoValid(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e723466f", new Object[]{this, context})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.wireless.security.sdk.initialize.IInitializeComponent
    public synchronized void loadLibraryAsync(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("201a83fa", new Object[]{this, context});
        } else {
            SecurityGuardManager.getInitializer().initializeAsync(context);
        }
    }

    @Override // com.taobao.wireless.security.sdk.initialize.IInitializeComponent
    public void loadLibraryAsync(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98c86344", new Object[]{this, context, str});
            return;
        }
        try {
            SecurityGuardManager.getInitializer().loadLibraryAsync(context, str);
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.wireless.security.sdk.initialize.IInitializeComponent
    public synchronized int loadLibrarySync(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3364d5e4", new Object[]{this, context})).intValue();
        }
        try {
            return SecurityGuardManager.getInitializer().loadLibrarySync(context);
        } catch (SecException e) {
            e.printStackTrace();
            return 1;
        }
    }

    @Override // com.taobao.wireless.security.sdk.initialize.IInitializeComponent
    public int loadLibrarySync(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85e4c56e", new Object[]{this, context, str})).intValue();
        }
        try {
            return SecurityGuardManager.getInitializer().loadLibrarySync(context, str);
        } catch (SecException e) {
            e.printStackTrace();
            return 1;
        }
    }

    @Override // com.taobao.wireless.security.sdk.initialize.IInitializeComponent
    public void registerInitFinishListener(IInitializeComponent.IInitFinishListener iInitFinishListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270b39d7", new Object[]{this, iInitFinishListener});
        } else if (iInitFinishListener == null) {
        } else {
            C1022a c1022a = new C1022a(this, iInitFinishListener);
            synchronized (this.b) {
                this.f23629a.add(c1022a);
            }
            try {
                SecurityGuardManager.getInitializer().registerInitFinishListener(c1022a);
            } catch (SecException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.taobao.wireless.security.sdk.initialize.IInitializeComponent
    public void unregisterInitFinishListener(IInitializeComponent.IInitFinishListener iInitFinishListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816715f0", new Object[]{this, iInitFinishListener});
        } else if (iInitFinishListener == null) {
        } else {
            C1022a c1022a = null;
            synchronized (this.b) {
                Iterator<C1022a> it = this.f23629a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C1022a next = it.next();
                    if (next.f23630a == iInitFinishListener) {
                        c1022a = next;
                        break;
                    }
                }
                if (c1022a != null) {
                    this.f23629a.remove(c1022a);
                }
            }
            if (c1022a == null) {
                return;
            }
            try {
                SecurityGuardManager.getInitializer().unregisterInitFinishListener(c1022a);
            } catch (SecException e) {
                e.printStackTrace();
            }
        }
    }
}
