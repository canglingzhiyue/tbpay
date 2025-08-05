package com.alibaba.wireless.security.aopsdk;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Objects;

/* loaded from: classes3.dex */
public class AopBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean TIME_PROFILE = true;

    /* renamed from: a  reason: collision with root package name */
    public static final String f4261a = "AopBase";
    public static final boolean b = false;

    private void a(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5afdd1f1", new Object[]{this, invocation});
        }
    }

    public void afterMethod(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129459f5", new Object[]{this, invocation});
        }
    }

    public void applyRulesToInvocation(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79fe61fe", new Object[]{this, invocation});
        }
    }

    public void beforeMethod(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f3fe72", new Object[]{this, invocation});
        }
    }

    public void callAfterBridge(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f9deecb", new Object[]{this, invocation});
        }
    }

    public boolean callBeforeBridge(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13674610", new Object[]{this, invocation})).booleanValue();
        }
        return false;
    }

    public void callOnConstructor(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e3588f5", new Object[]{this, invocation});
        }
    }

    public Object[] getNewArgs(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("7e55314c", new Object[]{this, invocation});
        }
        return null;
    }

    public Objects getNewReturnValue(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Objects) ipChange.ipc$dispatch("4886cc78", new Object[]{this, invocation});
        }
        return null;
    }

    public Throwable getNewThrowable(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("61ce2e61", new Object[]{this, invocation});
        }
        return null;
    }

    public boolean getTp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("314917fd", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void invokeCallback(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779856f5", new Object[]{this, invocation});
        }
    }

    public boolean isWatchMode(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73d637ae", new Object[]{this, invocation})).booleanValue();
        }
        return true;
    }

    public void modifyThiz(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b171a93", new Object[]{this, invocation});
        }
    }

    public void report(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4675afe", new Object[]{this, invocation});
        }
    }

    public void reportTimeCost(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c842a6e4", new Object[]{this, invocation});
        } else {
            report(invocation);
        }
    }

    public Object resultBridge(Invocation invocation) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ba541b46", new Object[]{this, invocation});
        }
        return null;
    }

    public void resultBridgeV(Invocation invocation) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9376eea2", new Object[]{this, invocation});
        }
    }

    public boolean shouldBlock(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59246d5c", new Object[]{this, invocation})).booleanValue();
        }
        return false;
    }

    public boolean shouldCallback(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c564df9e", new Object[]{this, invocation})).booleanValue();
        }
        return false;
    }

    public boolean shouldCatch(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7243ee", new Object[]{this, invocation})).booleanValue();
        }
        return false;
    }

    public boolean shouldChangeArgs(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d0de0f6", new Object[]{this, invocation})).booleanValue();
        }
        return false;
    }

    public boolean shouldChangeReturnValue(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68aff798", new Object[]{this, invocation})).booleanValue();
        }
        return false;
    }

    public boolean shouldModifyThisObject(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f9a964c", new Object[]{this, invocation})).booleanValue();
        }
        return false;
    }

    public boolean shouldSampleDefault(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3635ff2", new Object[]{this, invocation})).booleanValue();
        }
        return false;
    }
}
