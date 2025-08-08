package tb;

import mtopsdk.common.util.StringUtils;
import com.nirvana.tools.requestqueue.strategy.CallbackStrategy;
import com.nirvana.tools.requestqueue.strategy.ExecuteStrategy;
import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import tb.dbb;

/* loaded from: classes4.dex */
public abstract class day<T extends dbb> {
    private static final long MIN_TIMEOUT_MILLS = 500;
    private dbc<T> mAction;
    private dax<T> mCallback;
    private CallbackStrategy mCallbackStrategy;
    private ExecuteStrategy mExecuteStrategy;
    private String mID;
    private String mResponseType;
    private ThreadStrategy mThreadStrategy;
    private long mTimeoutMills;

    public day(dax<T> daxVar, dbc<T> dbcVar, ThreadStrategy threadStrategy, ExecuteStrategy executeStrategy, CallbackStrategy callbackStrategy, long j, Class<T> cls) {
        this.mTimeoutMills = 500L;
        this.mCallback = daxVar;
        this.mAction = dbcVar;
        this.mThreadStrategy = threadStrategy;
        this.mExecuteStrategy = executeStrategy;
        this.mCallbackStrategy = callbackStrategy;
        if (j > this.mTimeoutMills) {
            this.mTimeoutMills = j;
        }
        this.mResponseType = cls.getName();
    }

    public dbc<T> getAction() {
        return this.mAction;
    }

    public dax<T> getCallback() {
        return this.mCallback;
    }

    public CallbackStrategy getCallbackStrategy() {
        return this.mCallbackStrategy;
    }

    public ExecuteStrategy getExecuteStrategy() {
        return this.mExecuteStrategy;
    }

    public String getID() {
        if (StringUtils.isEmpty(this.mID)) {
            this.mID = getKey() + this.mResponseType;
        }
        return this.mID;
    }

    protected abstract String getKey();

    public ThreadStrategy getThreadStrategy() {
        return this.mThreadStrategy;
    }

    public long getTimeout() {
        return this.mTimeoutMills;
    }

    public void setTimeout(long j) {
        this.mTimeoutMills = j;
    }
}
