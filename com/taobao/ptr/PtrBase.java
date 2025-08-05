package com.taobao.ptr;

import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class PtrBase extends PullBase {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_VALUE = -1;
    private List<g> endPtrProxies;
    private PtrLayout mEndLayout;
    private volatile boolean mFreezeEnd;
    private volatile boolean mFreezeStart;
    private a mOnRefreshListener;
    private PtrLayout mStartLayout;
    private State mState;
    private List<g> startPtrProxies;

    /* renamed from: com.taobao.ptr.PtrBase$4  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18951a;
        public static final /* synthetic */ int[] b = new int[State.values().length];

        static {
            try {
                b[State.RESET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[State.PULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[State.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[State.REFRESHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[State.COMPLETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f18951a = new int[PullBase.Mode.values().length];
            try {
                f18951a[PullBase.Mode.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18951a[PullBase.Mode.PULL_FROM_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18951a[PullBase.Mode.PULL_FROM_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18951a[PullBase.Mode.BOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public enum State {
        RESET(0),
        PULL(1),
        READY(2),
        REFRESHING(3),
        COMPLETE(4);
        
        private int mIntValue;

        State(int i) {
            this.mIntValue = i;
        }

        static State mapIntToValue(int i) {
            State[] values;
            for (State state : values()) {
                if (i == state.getIntValue()) {
                    return state;
                }
            }
            return RESET;
        }

        int getIntValue() {
            return this.mIntValue;
        }
    }

    /* loaded from: classes7.dex */
    public interface a {
        void onPullEndToRefresh(PtrBase ptrBase);

        void onPullStartToRefresh(PtrBase ptrBase);
    }

    static {
        kge.a(1624678539);
    }

    public static /* synthetic */ Object ipc$super(PtrBase ptrBase, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1863181809:
                super.onDirectionUpdated((PullBase.Mode) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -1019106259:
                return new Boolean(super.allowCheckPullWhenRollBack());
            case -797660137:
                return new Integer(super.onRelease((PullBase.Mode) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).intValue()));
            case 2095602:
                super.onModeUpdated((PullBase.Mode) objArr[0]);
                return null;
            case 94498214:
                return new Boolean(super.allowCatchPullEndTouch());
            case 110925887:
                return new Boolean(super.allowCatchPullStartTouch());
            case 1717374400:
                super.onPull((PullBase.Mode) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$000(PtrBase ptrBase, State state, PullBase.Mode mode, CharSequence[] charSequenceArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("401f8fb5", new Object[]{ptrBase, state, mode, charSequenceArr});
        } else {
            ptrBase.setState(state, mode, charSequenceArr);
        }
    }

    public PtrBase(Context context) {
        super(context);
        this.mState = State.RESET;
    }

    public PtrBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mState = State.RESET;
    }

    public PtrBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mState = State.RESET;
    }

    @Override // com.taobao.ptr.PullBase
    /* renamed from: createStartPullLayout */
    public PtrLayout mo1210createStartPullLayout(Context context, PullBase.Mode mode, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PtrLayout) ipChange.ipc$dispatch("17491", new Object[]{this, context, mode, attributeSet});
        }
        this.mStartLayout = new PtrLayout(context, mode, getPullDirectionInternal(), attributeSet);
        addStartPtrProxy(this.mStartLayout);
        return this.mStartLayout;
    }

    @Override // com.taobao.ptr.PullBase
    /* renamed from: createEndPullLayout */
    public PtrLayout mo1209createEndPullLayout(Context context, PullBase.Mode mode, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PtrLayout) ipChange.ipc$dispatch("81b6bd38", new Object[]{this, context, mode, attributeSet});
        }
        this.mEndLayout = new PtrLayout(context, mode, getPullDirectionInternal(), attributeSet);
        addEndPtrProxy(this.mEndLayout);
        return this.mEndLayout;
    }

    public final void addStartPtrProxy(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101c6064", new Object[]{this, gVar});
            return;
        }
        if (this.startPtrProxies == null) {
            this.startPtrProxies = new ArrayList();
        }
        if (gVar == null) {
            return;
        }
        this.startPtrProxies.add(gVar);
    }

    public final void removeStartPtrProxy(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc397da1", new Object[]{this, gVar});
            return;
        }
        List<g> list = this.endPtrProxies;
        if (list == null) {
            return;
        }
        list.remove(gVar);
    }

    public final void addEndPtrProxy(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f50526dd", new Object[]{this, gVar});
            return;
        }
        if (this.endPtrProxies == null) {
            this.endPtrProxies = new ArrayList();
        }
        if (gVar == null) {
            return;
        }
        this.endPtrProxies.add(gVar);
    }

    public final void removeEndPtrProxy(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f526f5a", new Object[]{this, gVar});
            return;
        }
        List<g> list = this.endPtrProxies;
        if (list == null) {
            return;
        }
        list.remove(gVar);
    }

    @Override // com.taobao.ptr.PullBase
    public final void onDirectionUpdated(PullBase.Mode mode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f21a0f", new Object[]{this, mode, new Integer(i)});
            return;
        }
        super.onDirectionUpdated(mode, i);
        setState(State.RESET, mode, new CharSequence[0]);
        int i2 = AnonymousClass4.f18951a[mode.ordinal()];
        if (i2 == 1) {
            return;
        }
        if (i2 == 2) {
            updateStartDirection(i);
        } else if (i2 == 3) {
            updateEndDirection(i);
        } else {
            updateStartDirection(i);
            updateEndDirection(i);
        }
    }

    private void updateStartDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f26cb6", new Object[]{this, new Integer(i)});
            return;
        }
        for (g gVar : this.startPtrProxies) {
            gVar.onUpdateDirection(i);
        }
    }

    private void updateEndDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5131b2f", new Object[]{this, new Integer(i)});
            return;
        }
        for (g gVar : this.endPtrProxies) {
            gVar.onUpdateDirection(i);
        }
    }

    @Override // com.taobao.ptr.PullBase
    public final void onModeUpdated(PullBase.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ff9f2", new Object[]{this, mode});
            return;
        }
        super.onModeUpdated(mode);
        int i = AnonymousClass4.f18951a[mode.ordinal()];
        if (i == 1) {
            for (g gVar : this.startPtrProxies) {
                gVar.onDisable();
            }
            for (g gVar2 : this.endPtrProxies) {
                gVar2.onDisable();
            }
        } else if (i == 2) {
            for (g gVar3 : this.startPtrProxies) {
                gVar3.onEnable();
            }
            for (g gVar4 : this.endPtrProxies) {
                gVar4.onDisable();
            }
        } else if (i == 3) {
            for (g gVar5 : this.startPtrProxies) {
                gVar5.onDisable();
            }
            for (g gVar6 : this.endPtrProxies) {
                gVar6.onEnable();
            }
        } else {
            for (g gVar7 : this.startPtrProxies) {
                gVar7.onEnable();
            }
            for (g gVar8 : this.endPtrProxies) {
                gVar8.onEnable();
            }
        }
    }

    public final void setRefreshing(PullBase.Mode mode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7361f232", new Object[]{this, mode, new Boolean(z)});
        } else if (!getMode().isUnderPermit(mode) || checkIfFreeze(mode) || !isIdle()) {
        } else {
            if (z) {
                int refreshingValue = getRefreshingValue(mode);
                if (refreshingValue == -1) {
                    return;
                }
                simulateDrag((int) (refreshingValue * 1.2f));
                return;
            }
            updateCurrentMode(mode);
            setState(State.REFRESHING, mode, new CharSequence[0]);
        }
    }

    private boolean checkIfFreeze(PullBase.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f92aa39", new Object[]{this, mode})).booleanValue();
        }
        int i = AnonymousClass4.f18951a[mode.ordinal()];
        if (i == 2) {
            if (this.mFreezeStart) {
                return true;
            }
        } else if (i == 3 && this.mFreezeEnd) {
            return true;
        }
        return false;
    }

    public final void freezeEnd(boolean z, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("696a988d", new Object[]{this, new Boolean(z), charSequence});
            return;
        }
        if (getMode().permitsPullEnd()) {
            this.mFreezeEnd = z;
            for (g gVar : this.endPtrProxies) {
                gVar.onFreeze(z, charSequence);
            }
        }
        if (!z || getCurrentMode() != PullBase.Mode.PULL_FROM_END) {
            return;
        }
        smoothScrollTo(0, new PullBase.c() { // from class: com.taobao.ptr.PtrBase.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.ptr.PullBase.c
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    PtrBase.access$000(PtrBase.this, State.RESET, PullBase.Mode.PULL_FROM_END, new CharSequence[0]);
                }
            }
        });
    }

    public final void freezeStart(boolean z, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d9feca6", new Object[]{this, new Boolean(z), charSequence});
            return;
        }
        if (getMode().permitsPullStart()) {
            this.mFreezeStart = z;
            for (g gVar : this.startPtrProxies) {
                gVar.onFreeze(z, charSequence);
            }
        }
        if (!z || getCurrentMode() != PullBase.Mode.PULL_FROM_START) {
            return;
        }
        smoothScrollTo(0, new PullBase.c() { // from class: com.taobao.ptr.PtrBase.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.ptr.PullBase.c
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    PtrBase.access$000(PtrBase.this, State.RESET, PullBase.Mode.PULL_FROM_START, new CharSequence[0]);
                }
            }
        });
    }

    public final State getState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (State) ipChange.ipc$dispatch("fc5e314b", new Object[]{this}) : this.mState;
    }

    private boolean isIdle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3f261a9", new Object[]{this})).booleanValue() : getState() == State.RESET && !isRunnableScrolling();
    }

    @Override // com.taobao.ptr.PullBase
    /* renamed from: getStartLayout */
    public PtrLayout mo1212getStartLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PtrLayout) ipChange.ipc$dispatch("a0d29b44", new Object[]{this}) : this.mStartLayout;
    }

    @Override // com.taobao.ptr.PullBase
    /* renamed from: getEndLayout */
    public PtrLayout mo1211getEndLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PtrLayout) ipChange.ipc$dispatch("3cede1ab", new Object[]{this}) : this.mEndLayout;
    }

    public final void setStartLoadingDelegate(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea79dc6", new Object[]{this, eVar});
        } else {
            this.mStartLayout.setLoadingDelegate(eVar);
        }
    }

    public final void setEndLoadingDelegate(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f092f96d", new Object[]{this, eVar});
        } else {
            this.mEndLayout.setLoadingDelegate(eVar);
        }
    }

    @Override // com.taobao.ptr.PullBase
    public final boolean allowCatchPullStartTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69c983f", new Object[]{this})).booleanValue();
        }
        if (getState() != State.REFRESHING) {
            return super.allowCatchPullStartTouch();
        }
        return false;
    }

    @Override // com.taobao.ptr.PullBase
    public final boolean allowCatchPullEndTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a1eda6", new Object[]{this})).booleanValue();
        }
        if (getState() != State.REFRESHING) {
            return super.allowCatchPullEndTouch();
        }
        return false;
    }

    @Override // com.taobao.ptr.PullBase
    public boolean allowCheckPullWhenRollBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c341ac2d", new Object[]{this})).booleanValue();
        }
        if (getState() != State.READY && getState() != State.COMPLETE) {
            return super.allowCheckPullWhenRollBack();
        }
        return false;
    }

    @Override // com.taobao.ptr.PullBase
    public final void onPull(PullBase.Mode mode, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("665d0dc0", new Object[]{this, mode, new Float(f), new Integer(i)});
            return;
        }
        super.onPull(mode, f, i);
        if (checkIfFreeze(mode)) {
            return;
        }
        pullEvent(mode, i);
    }

    @Override // com.taobao.ptr.PullBase
    public final int onRelease(PullBase.Mode mode, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d074ac17", new Object[]{this, mode, new Float(f), new Integer(i)})).intValue();
        }
        if (checkIfFreeze(mode)) {
            return super.onRelease(mode, f, i);
        }
        return releaseEvent(mode, i);
    }

    @Override // com.taobao.ptr.PullBase
    public final void onReset(PullBase.Mode mode, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec4151ac", new Object[]{this, mode, new Float(f), new Integer(i)});
        } else if (checkIfFreeze(mode)) {
        } else {
            resetEvent(mode, i);
        }
    }

    private int getPullLayoutContentSize(PullBase.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3216b1c1", new Object[]{this, mode})).intValue();
        }
        int pullDirectionInternal = getPullDirectionInternal();
        int i = AnonymousClass4.f18951a[mode.ordinal()];
        if (i != 2) {
            if (i != 3 || this.mEndLayout.isDisableIntrinsicPullFeature()) {
                return -1;
            }
            return this.mEndLayout.getContentSize(pullDirectionInternal);
        } else if (this.mStartLayout.isDisableIntrinsicPullFeature()) {
            return -1;
        } else {
            return -this.mStartLayout.getContentSize(pullDirectionInternal);
        }
    }

    private int getRefreshingValue(PullBase.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd157940", new Object[]{this, mode})).intValue();
        }
        int readyToRefreshingValue = getPullAdapter() instanceof d ? ((d) getPullAdapter()).getReadyToRefreshingValue(this, mode, getPullDirectionInternal()) : -1;
        return readyToRefreshingValue == -1 ? getPullLayoutContentSize(mode) : readyToRefreshingValue;
    }

    private int getReleaseValue(PullBase.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69b37e0c", new Object[]{this, mode})).intValue();
        }
        int releaseTargetValue = getPullAdapter() instanceof d ? ((d) getPullAdapter()).getReleaseTargetValue(this, mode, getPullDirectionInternal()) : -1;
        return releaseTargetValue == -1 ? getPullLayoutContentSize(mode) : releaseTargetValue;
    }

    private void resetEvent(PullBase.Mode mode, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a83f167c", new Object[]{this, mode, new Float(f)});
        } else if (getState() == State.READY) {
            setState(State.REFRESHING, mode, new CharSequence[0]);
        } else {
            setState(State.RESET, mode, new CharSequence[0]);
        }
    }

    private synchronized void setState(State state, final PullBase.Mode mode, CharSequence... charSequenceArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdbe9ffa", new Object[]{this, state, mode, charSequenceArr});
            return;
        }
        this.mState = state;
        int i = AnonymousClass4.b[state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return;
            }
            if (i == 3) {
                return;
            }
            if (i == 4) {
                if (!checkIfFreeze(mode)) {
                    onRefreshing(mode);
                    callRefreshListener();
                }
            } else if (i == 5 && !checkIfFreeze(mode)) {
                CharSequence string = getContext().getString(R.string.ptr_complete_label);
                if (charSequenceArr != null && charSequenceArr.length > 0) {
                    string = charSequenceArr[0];
                }
                onComplete(mode, string);
                smoothScrollTo(0, allowCheckPullWhenRollBack(), new PullBase.c() { // from class: com.taobao.ptr.PtrBase.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.ptr.PullBase.c
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            PtrBase.access$000(PtrBase.this, State.RESET, mode, new CharSequence[0]);
                        }
                    }
                });
            }
        } else if (!checkIfFreeze(mode)) {
            onReset(mode);
            updateCurrentMode(PullBase.Mode.DISABLED);
        }
    }

    private void pullEvent(PullBase.Mode mode, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c616f972", new Object[]{this, mode, new Float(f)});
            return;
        }
        onPull(mode, f);
        int refreshingValue = getRefreshingValue(mode);
        if (refreshingValue == -1) {
            return;
        }
        int i = AnonymousClass4.f18951a[mode.ordinal()];
        if (i == 2) {
            if (f <= refreshingValue) {
                setState(State.READY, mode, new CharSequence[0]);
            } else {
                setState(State.PULL, mode, new CharSequence[0]);
            }
        } else if (i != 3) {
        } else {
            if (f >= refreshingValue) {
                setState(State.READY, mode, new CharSequence[0]);
            } else {
                setState(State.PULL, mode, new CharSequence[0]);
            }
        }
    }

    private void onPull(PullBase.Mode mode, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a87699a3", new Object[]{this, mode, new Float(f)});
            return;
        }
        int i = AnonymousClass4.f18951a[mode.ordinal()];
        if (i == 2) {
            for (g gVar : this.startPtrProxies) {
                gVar.onPull(f);
            }
        } else if (i == 3) {
            for (g gVar2 : this.endPtrProxies) {
                gVar2.onPull(f);
            }
        }
    }

    private int releaseEvent(PullBase.Mode mode, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90970927", new Object[]{this, mode, new Float(f)})).intValue();
        }
        onRelease(mode, f);
        int releaseValue = getState() == State.READY ? getReleaseValue(mode) : 0;
        if (releaseValue != -1) {
            return releaseValue;
        }
        return 0;
    }

    private void onRelease(PullBase.Mode mode, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f7f9ebf", new Object[]{this, mode, new Float(f)});
            return;
        }
        int i = AnonymousClass4.f18951a[mode.ordinal()];
        if (i == 2) {
            for (g gVar : this.startPtrProxies) {
                gVar.onRelease(f);
            }
        } else if (i == 3) {
            for (g gVar2 : this.endPtrProxies) {
                gVar2.onRelease(f);
            }
        }
    }

    private void onRefreshing(PullBase.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f226df", new Object[]{this, mode});
            return;
        }
        int i = AnonymousClass4.f18951a[mode.ordinal()];
        if (i == 2) {
            for (g gVar : this.startPtrProxies) {
                gVar.onRefreshing();
            }
        } else if (i == 3) {
            for (g gVar2 : this.endPtrProxies) {
                gVar2.onRefreshing();
            }
        }
    }

    public final void refreshComplete(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb920b5f", new Object[]{this, charSequence});
        } else if (checkIfFreeze(getCurrentMode())) {
        } else {
            setState(State.COMPLETE, getCurrentMode(), charSequence);
        }
    }

    private void onComplete(PullBase.Mode mode, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d275d5", new Object[]{this, mode, charSequence});
            return;
        }
        int i = AnonymousClass4.f18951a[mode.ordinal()];
        if (i == 2) {
            for (g gVar : this.startPtrProxies) {
                gVar.onCompleteUpdate(charSequence);
            }
        } else if (i == 3) {
            for (g gVar2 : this.endPtrProxies) {
                gVar2.onCompleteUpdate(charSequence);
            }
        }
    }

    private void onReset(PullBase.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3696d4a9", new Object[]{this, mode});
            return;
        }
        int i = AnonymousClass4.f18951a[mode.ordinal()];
        if (i == 2) {
            for (g gVar : this.startPtrProxies) {
                gVar.onReset();
            }
        } else if (i == 3) {
            for (g gVar2 : this.endPtrProxies) {
                gVar2.onReset();
            }
        }
    }

    private void callRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36de0a78", new Object[]{this});
        } else if (this.mOnRefreshListener == null) {
        } else {
            if (getCurrentMode() == PullBase.Mode.PULL_FROM_START) {
                this.mOnRefreshListener.onPullStartToRefresh(this);
            } else if (getCurrentMode() != PullBase.Mode.PULL_FROM_END) {
            } else {
                this.mOnRefreshListener.onPullEndToRefresh(this);
            }
        }
    }

    public final void setOnRefreshListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9970aa3c", new Object[]{this, aVar});
        } else {
            this.mOnRefreshListener = aVar;
        }
    }
}
