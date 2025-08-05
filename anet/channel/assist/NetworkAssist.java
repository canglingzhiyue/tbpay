package anet.channel.assist;

import android.content.Context;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public class NetworkAssist {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NETWORK_ASSIST_MANAGER_CLASS_NAME = "anet.channel.assist.AssistManager";
    private static boolean isAssistValid = true;
    private static volatile IAssistManager sAssistManager;
    private static volatile Context sContext;
    public static final IAssistManager DEFAULT_MANAGER = new IAssistManager() { // from class: anet.channel.assist.NetworkAssist.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // anet.channel.assist.IAssistManager
        public void initialize(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
            }
        }

        @Override // anet.channel.assist.IAssistManager
        public boolean isInitialized() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // anet.channel.assist.IAssistManager
        public ICapability getCapability(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ICapability) ipChange.ipc$dispatch("25bc8e05", new Object[]{this, new Integer(i)}) : NetworkAssist.DEFAULT_ABILITY;
        }
    };
    public static final ICapability DEFAULT_ABILITY = new ICapability() { // from class: anet.channel.assist.NetworkAssist.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // anet.channel.assist.ICapability
        public boolean isEnable() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
            }
            return false;
        }
    };

    public static IAssistManager getAssistManager() {
        if (!isAssistValid) {
            return DEFAULT_MANAGER;
        }
        if (sAssistManager != null) {
            return sAssistManager;
        }
        synchronized (NetworkAssist.class) {
            if (sAssistManager != null) {
                return sAssistManager;
            }
            Constructor<?> declaredConstructor = Class.forName(NETWORK_ASSIST_MANAGER_CLASS_NAME).getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            sAssistManager = (IAssistManager) declaredConstructor.newInstance(new Object[0]);
            return sAssistManager;
        }
    }

    public static void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{context});
        } else if (context == null) {
        } else {
            sContext = context;
        }
    }

    public static Context getContext() {
        if (sContext != null) {
            return sContext;
        }
        synchronized (NetworkAssist.class) {
            if (sContext != null) {
                return sContext;
            }
            try {
                Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(cls, new Object[0]);
                sContext = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return sContext;
        }
    }
}
