package com.taobao.themis.inside;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.t;
import com.taobao.themis.uniapp.solution.page.TMSUniAppPageSolution;
import com.taobao.themis.web.solution.TMSLegacyWebSolution;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.qpo;

/* loaded from: classes9.dex */
public class TMSSDK implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile boolean isInitialized;
    private static volatile boolean isInitializing;
    private static volatile a mDefaultInitLister;
    private static volatile List<a> mInitListeners;

    /* loaded from: classes9.dex */
    public interface a {
        void a();

        void b();
    }

    static {
        kge.a(-1899065603);
        kge.a(1028243835);
        isInitializing = false;
        isInitialized = false;
        mInitListeners = new ArrayList();
    }

    private static void initDefaultInitListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f6a99c", new Object[0]);
        } else if (mDefaultInitLister != null) {
        } else {
            mDefaultInitLister = new a() { // from class: com.taobao.themis.inside.TMSSDK.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.themis.inside.TMSSDK.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        c.a();
                    }
                }

                @Override // com.taobao.themis.inside.TMSSDK.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        c.b();
                    }
                }
            };
            mInitListeners.add(mDefaultInitLister);
        }
    }

    public static synchronized boolean isInitialized() {
        synchronized (TMSSDK.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[0])).booleanValue();
            }
            return isInitialized;
        }
    }

    public static synchronized void init(Context context) {
        synchronized (TMSSDK.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("609fd211", new Object[]{context});
                return;
            }
            if (!isInitialized && !isInitializing) {
                isInitializing = true;
                initContainerNecessary(context);
            }
        }
    }

    public static synchronized void init(Context context, a aVar) {
        synchronized (TMSSDK.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e233716", new Object[]{context, aVar});
            } else if (!isInitialized && !isInitializing) {
                isInitializing = true;
                mInitListeners.add(aVar);
                initContainerNecessary(context);
            } else if (isInitialized) {
                aVar.a();
                aVar.b();
            } else {
                mInitListeners.add(aVar);
            }
        }
    }

    private static synchronized void initContainerNecessary(Context context) {
        synchronized (TMSSDK.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("325c3ce3", new Object[]{context});
                return;
            }
            initDefaultInitListener();
            t.a(context);
            qpo.a(context);
            com.taobao.themis.kernel.solution.b.a(TMSSolutionType.WEB_SINGLE_PAGE, TMSLegacyWebSolution.class);
            com.taobao.themis.kernel.solution.b.a(TMSSolutionType.UNIAPP, TMSUniAppPageSolution.class);
            InitListeners();
        }
    }

    private static void InitListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74eae3f6", new Object[0]);
            return;
        }
        if (mInitListeners != null) {
            for (a aVar : mInitListeners) {
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
        isInitializing = false;
        isInitialized = true;
        if (mInitListeners == null) {
            return;
        }
        for (a aVar2 : mInitListeners) {
            if (aVar2 != null) {
                aVar2.b();
            }
        }
    }
}
