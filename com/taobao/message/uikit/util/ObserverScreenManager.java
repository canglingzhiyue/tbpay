package com.taobao.message.uikit.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes7.dex */
public class ObserverScreenManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ObserverScreenManager mObserverScreenManager;
    private ArrayList<ObserverScreenListener> list = new ArrayList<>();

    static {
        kge.a(-476009818);
    }

    public static ObserverScreenManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObserverScreenManager) ipChange.ipc$dispatch("72e80f5d", new Object[0]);
        }
        if (mObserverScreenManager == null) {
            synchronized (ObserverScreenManager.class) {
                if (mObserverScreenManager == null) {
                    mObserverScreenManager = new ObserverScreenManager();
                }
            }
        }
        return mObserverScreenManager;
    }

    public void add(ObserverScreenListener observerScreenListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dacc4f5c", new Object[]{this, observerScreenListener});
        } else if (observerScreenListener == null) {
        } else {
            this.list.add(observerScreenListener);
        }
    }

    public void notifyObserver(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa02690", new Object[]{this, str});
            return;
        }
        Iterator<ObserverScreenListener> it = this.list.iterator();
        while (it.hasNext()) {
            it.next().observerScreenChange(str);
        }
    }

    public void remove(ObserverScreenListener observerScreenListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79d9d7f", new Object[]{this, observerScreenListener});
        } else if (!this.list.contains(observerScreenListener)) {
        } else {
            this.list.remove(observerScreenListener);
        }
    }
}
