package org.webrtc;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.util.d;
import com.taobao.trtc.utils.TrtcLog;
import org.webrtc.Logging;
import tb.kge;
import tb.qvb;

/* loaded from: classes9.dex */
public class PeerConnectionFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1289194547);
    }

    private static native void nativeInitializeAndroidGlobals();

    /* loaded from: classes9.dex */
    public static class InitializationOptions {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Context applicationContext;
        public final boolean enableInternalTracer;
        public final boolean enableVideoHwAcceleration;
        public final String fieldTrials;
        public Loggable loggable;
        public Logging.Severity loggableSeverity;
        public final NativeLibraryLoader nativeLibraryLoader;
        public final String nativeLibraryName;

        static {
            kge.a(-1100852211);
        }

        private InitializationOptions(Context context, String str, boolean z, boolean z2, NativeLibraryLoader nativeLibraryLoader, String str2, Loggable loggable, Logging.Severity severity) {
            this.applicationContext = context;
            this.fieldTrials = str;
            this.enableInternalTracer = z;
            this.enableVideoHwAcceleration = z2;
            this.nativeLibraryLoader = nativeLibraryLoader;
            this.nativeLibraryName = str2;
            this.loggable = loggable;
            this.loggableSeverity = severity;
        }

        public static Builder builder(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("ccbabbfb", new Object[]{context}) : new Builder(context);
        }

        /* loaded from: classes9.dex */
        public static class Builder {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final Context applicationContext;
            private String fieldTrials = "";
            private boolean enableInternalTracer = false;
            private boolean enableVideoHwAcceleration = true;
            private NativeLibraryLoader nativeLibraryLoader = qvb.a();
            private String nativeLibraryName = "artc_engine";
            private Loggable loggable = null;
            private Logging.Severity loggableSeverity = null;

            static {
                kge.a(1156500964);
            }

            public Builder(Context context) {
                this.applicationContext = context;
            }

            public Builder setNativeLibraryName(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("f3bafc83", new Object[]{this, str});
                }
                this.nativeLibraryName = str;
                return this;
            }

            public InitializationOptions createInitializationOptions() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (InitializationOptions) ipChange.ipc$dispatch("8fdb392f", new Object[]{this}) : new InitializationOptions(this.applicationContext, this.fieldTrials, this.enableInternalTracer, this.enableVideoHwAcceleration, this.nativeLibraryLoader, this.nativeLibraryName, this.loggable, this.loggableSeverity);
            }
        }
    }

    public static void initialize(InitializationOptions initializationOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede8f199", new Object[]{initializationOptions});
            return;
        }
        ConStringUtils.initialize(initializationOptions.applicationContext);
        NativeLibrary.initialize(initializationOptions.nativeLibraryLoader, initializationOptions.nativeLibraryName);
        if (!NativeLibrary.isLoaded()) {
            return;
        }
        try {
            nativeInitializeAndroidGlobals();
        } catch (Throwable th) {
            TrtcLog.a(d.TAG, "native load error, " + th.getMessage());
        }
    }
}
