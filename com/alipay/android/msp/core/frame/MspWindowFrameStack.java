package com.alipay.android.msp.core.frame;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.framework.ext.MspExtSceneManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes3.dex */
public class MspWindowFrameStack {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final MspContext d;
    private final List<MspWindowFrame> b = new ArrayList();
    private final Object c = new Object();
    private final Map<String, MspWindowFrame> e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final BlockingDeque<MspWindowFrame> f4549a = new LinkedBlockingDeque();

    public MspWindowFrameStack(MspContext mspContext) {
        this.d = mspContext;
    }

    public int size() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue() : this.f4549a.size();
    }

    public void pushFrame(MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bb3280", new Object[]{this, mspWindowFrame});
            return;
        }
        MspContext mspContext = this.d;
        if (mspContext != null && mspContext.isBizAppCollectMoneyPage) {
            PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "FRAME_PUSH");
        }
        synchronized (this.c) {
            if (mspWindowFrame == null) {
                return;
            }
            this.f4549a.push(mspWindowFrame);
            LogUtil.record(2, "phonecashiermsp#flybird", "MspWindowFrameStack.pushFrame", "frame count:" + this.f4549a.size());
            if (this.d == null) {
                return;
            }
            MspUIClient mspUIClient = this.d.getMspUIClient();
            if (mspUIClient != null) {
                mspUIClient.onWindowChanged(mspWindowFrame);
            }
        }
    }

    public MspWindowFrame peekFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWindowFrame) ipChange.ipc$dispatch("199f1223", new Object[]{this});
        }
        if (this.f4549a.isEmpty()) {
            return null;
        }
        return this.f4549a.peek();
    }

    public MspWindowFrame getTopTplFrame() {
        MspWindowFrame[] mspWindowFrameArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWindowFrame) ipChange.ipc$dispatch("a81a7019", new Object[]{this});
        }
        if (this.f4549a.isEmpty()) {
            return null;
        }
        for (MspWindowFrame mspWindowFrame : (MspWindowFrame[]) this.f4549a.toArray(new MspWindowFrame[0])) {
            if (mspWindowFrame != null && mspWindowFrame.isDefaultWindow()) {
                return mspWindowFrame;
            }
        }
        return null;
    }

    public MspWindowFrame getTopTplOrNativeFrame() {
        MspWindowFrame[] mspWindowFrameArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWindowFrame) ipChange.ipc$dispatch("6777fa93", new Object[]{this});
        }
        if (this.f4549a.isEmpty()) {
            return null;
        }
        for (MspWindowFrame mspWindowFrame : (MspWindowFrame[]) this.f4549a.toArray(new MspWindowFrame[0])) {
            if (mspWindowFrame != null && (mspWindowFrame.getWindowType() == 11 || mspWindowFrame.getWindowType() == 14)) {
                return mspWindowFrame;
            }
        }
        return null;
    }

    public void popTopFrame(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3a785a", new Object[]{this, str});
            return;
        }
        synchronized (this.c) {
            if (this.f4549a.isEmpty()) {
                return;
            }
            MspWindowFrame peek = this.f4549a.peek();
            String tplId = peek != null ? peek.getTplId() : null;
            if (tplId == null) {
                return;
            }
            if (!tplId.endsWith("@".concat(String.valueOf(str)))) {
                return;
            }
            b();
        }
    }

    public boolean popTopWindowFrame(boolean z, String str) {
        MspWindowFrame mspWindowFrame;
        MspWindowFrame peek;
        MspUIClient mspUIClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86356022", new Object[]{this, new Boolean(z), str})).booleanValue();
        }
        synchronized (this.c) {
            if (this.f4549a.isEmpty()) {
                return true;
            }
            LogUtil.record(2, "MspWindowFrameStack:popTopWindowFrame", "tplId=" + str + " , isDestroyView=" + z);
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                mspWindowFrame = null;
                try {
                    if (this.f4549a.isEmpty()) {
                        break;
                    }
                    MspWindowFrame peek2 = this.f4549a.peek();
                    if (peek2 == null) {
                        return false;
                    }
                    if (z && !z2) {
                        try {
                            String tplId = peek2.getTplId();
                            LogUtil.record(1, "Destroy_frameTplId", tplId);
                            if (tplId == null) {
                                return false;
                            }
                            if (!tplId.endsWith("@".concat(String.valueOf(str)))) {
                                return false;
                            }
                            z2 = true;
                        } catch (EmptyStackException e) {
                            e = e;
                            mspWindowFrame = peek2;
                            if (this.d != null) {
                                this.d.getStatisticInfo().addError(ErrorType.DEFAULT, e.getClass().getName(), e);
                            }
                            LogUtil.printExceptionStackTrace(e);
                            if (mspWindowFrame != null) {
                                peek.setBackAnim(true);
                                peek.setDestroyView(z);
                                if (this.d != null) {
                                    mspUIClient.onWindowChanged(peek);
                                }
                            }
                            return this.f4549a.isEmpty();
                        }
                    }
                    if (peek2.isDefaultWindow()) {
                        if (z3) {
                            mspWindowFrame = peek2;
                            break;
                        }
                        z3 = true;
                    }
                    b();
                } catch (EmptyStackException e2) {
                    e = e2;
                }
            }
            if (mspWindowFrame != null && mspWindowFrame.isDefaultWindow() && (peek = this.f4549a.peek()) != null) {
                peek.setBackAnim(true);
                peek.setDestroyView(z);
                if (this.d != null && (mspUIClient = this.d.getMspUIClient()) != null) {
                    mspUIClient.onWindowChanged(peek);
                }
            }
            return this.f4549a.isEmpty();
        }
    }

    public void clearAllContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a9ef591", new Object[]{this});
            return;
        }
        synchronized (this) {
            for (MspWindowFrame mspWindowFrame : this.f4549a) {
                Context context = this.d.getContext();
                if (context != null) {
                    if (this.d.getGrayUnifiedReadPadConfig()) {
                        if (this.d.getMspExtSceneManager() != null && this.d.getMspExtSceneManager().isAutoRotatingTpl(mspWindowFrame.getTplId())) {
                            mspWindowFrame.removeView();
                        }
                    } else if (MspExtSceneManager.isAutoRotatingTpl(mspWindowFrame.getTplId(), context)) {
                        mspWindowFrame.removeView();
                    }
                }
            }
        }
    }

    public void markAllFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8362a40", new Object[]{this});
            return;
        }
        synchronized (this) {
            for (MspWindowFrame mspWindowFrame : this.f4549a) {
                mspWindowFrame.setInPrevStack(true);
            }
        }
    }

    public void clearDataStack(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f883089c", new Object[]{this, new Boolean(z)});
            return;
        }
        synchronized (this) {
            if (z) {
                MspWindowFrame peekFirst = this.f4549a.peekFirst();
                while (this.f4549a.peekLast() != null && this.f4549a.peekLast() != peekFirst) {
                    a();
                    LogUtil.record(1, "MspWindowFrameStack:clearDataStack", "pop() != null");
                }
            } else {
                while (b() != null) {
                    LogUtil.record(1, "MspWindowFrameStack:clearDataStack", "pop() != null");
                }
                this.f4549a.clear();
            }
        }
    }

    private synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f4549a.isEmpty()) {
        } else {
            LogUtil.record(2, "phonecashiermsp#flybird", "MspWindowFrameStack.pop", "frame count:" + this.f4549a.size());
            a(this.f4549a.removeLast());
        }
    }

    private synchronized MspWindowFrame b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWindowFrame) ipChange.ipc$dispatch("b0d99493", new Object[]{this});
        } else if (this.f4549a.isEmpty()) {
            return null;
        } else {
            MspWindowFrame pop = this.f4549a.pop();
            LogUtil.record(2, "phonecashiermsp#flybird", "MspWindowFrameStack.pop", "frame count:" + this.f4549a.size());
            a(pop);
            return pop;
        }
    }

    public MspWindowFrame getCurrentDefaultWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWindowFrame) ipChange.ipc$dispatch("9b956367", new Object[]{this});
        }
        if (this.f4549a.isEmpty()) {
            return null;
        }
        MspWindowFrame[] mspWindowFrameArr = (MspWindowFrame[]) this.f4549a.toArray(new MspWindowFrame[0]);
        for (int length = mspWindowFrameArr.length - 1; length >= 0; length--) {
            MspWindowFrame mspWindowFrame = mspWindowFrameArr[length];
            if (mspWindowFrame.getWindowType() == 11) {
                return mspWindowFrame;
            }
        }
        return null;
    }

    public void clearWin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eeaa356", new Object[]{this});
            return;
        }
        try {
            synchronized (this.b) {
                for (MspWindowFrame mspWindowFrame : this.b) {
                    if (mspWindowFrame != null) {
                        mspWindowFrame.dispose();
                    }
                }
                this.b.clear();
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    private void a(MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b53249ee", new Object[]{this, mspWindowFrame});
        } else if (mspWindowFrame == null) {
        } else {
            synchronized (this.b) {
                this.b.add(mspWindowFrame);
            }
            String tplHashId = mspWindowFrame.getTplHashId();
            if (StringUtils.isEmpty(tplHashId)) {
                return;
            }
            this.e.remove(tplHashId);
        }
    }

    public synchronized MspWindowFrame findFrameBySender(Object obj) {
        MspWindowFrame[] mspWindowFrameArr;
        MspWindowFrame[] mspWindowFrameArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWindowFrame) ipChange.ipc$dispatch("7effde59", new Object[]{this, obj});
        }
        if (!this.f4549a.isEmpty()) {
            for (MspWindowFrame mspWindowFrame : (MspWindowFrame[]) this.f4549a.toArray(new MspWindowFrame[0])) {
                FBContext fbContextFromView = PluginManager.getRender().getFbContextFromView(mspWindowFrame.getContentView());
                if (fbContextFromView != null && fbContextFromView.equals(obj)) {
                    return mspWindowFrame;
                }
            }
        }
        if (!this.b.isEmpty()) {
            for (MspWindowFrame mspWindowFrame2 : (MspWindowFrame[]) this.b.toArray(new MspWindowFrame[0])) {
                FBContext fbContextFromView2 = PluginManager.getRender().getFbContextFromView(mspWindowFrame2.getContentView());
                if (fbContextFromView2 != null && fbContextFromView2.equals(obj)) {
                    return mspWindowFrame2;
                }
            }
        }
        return null;
    }

    public void registerFrameOnHash(String str, MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262cd8e", new Object[]{this, str, mspWindowFrame});
        } else if (StringUtils.isEmpty(str) || mspWindowFrame == null) {
        } else {
            this.e.put(str, mspWindowFrame);
        }
    }

    public MspWindowFrame getMspWindowFrameViaHash(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspWindowFrame) ipChange.ipc$dispatch("eff7ff8", new Object[]{this, str}) : this.e.get(str);
    }

    public boolean isMspWindowFrameHasCallback(MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4dab3253", new Object[]{this, mspWindowFrame})).booleanValue() : this.e.containsValue(mspWindowFrame);
    }
}
