package mtopsdk.mtop.xcommand;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import mtopsdk.common.util.StringUtils;
import tb.kge;

/* loaded from: classes9.dex */
public class XcmdEventMgr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.XcmdEventMgr";
    public static Set<NewXcmdListener> oxcmdListeners;
    private static XcmdEventMgr xm;

    static {
        kge.a(20072338);
        oxcmdListeners = new CopyOnWriteArraySet();
    }

    public static XcmdEventMgr getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XcmdEventMgr) ipChange.ipc$dispatch("23c174e1", new Object[0]);
        }
        if (xm == null) {
            synchronized (XcmdEventMgr.class) {
                if (xm == null) {
                    xm = new XcmdEventMgr();
                }
            }
        }
        return xm;
    }

    public void addOrangeXcmdListener(NewXcmdListener newXcmdListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d154011", new Object[]{this, newXcmdListener});
        } else {
            oxcmdListeners.add(newXcmdListener);
        }
    }

    public void removeOrangeXcmdListener(NewXcmdListener newXcmdListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16291b0e", new Object[]{this, newXcmdListener});
        } else {
            oxcmdListeners.remove(newXcmdListener);
        }
    }

    public void onOrangeEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60c79c7e", new Object[]{this, str});
        } else if (!StringUtils.isBlank(str)) {
            NewXcmdEvent newXcmdEvent = new NewXcmdEvent(str);
            for (NewXcmdListener newXcmdListener : oxcmdListeners) {
                try {
                    newXcmdListener.onEvent(newXcmdEvent);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
