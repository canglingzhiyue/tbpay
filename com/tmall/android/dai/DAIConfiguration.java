package com.tmall.android.dai;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.adapter.DAIUserAdapter;
import java.io.File;
import java.util.Map;
import tb.kge;
import tb.rkp;

/* loaded from: classes9.dex */
public class DAIConfiguration {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, String> apiConfig;
    private boolean debugMode;
    private File modelFilePath;
    private DAIUserAdapter userAdapter;
    private Class<? extends DAIUserAdapter> userAdapterClass;

    static {
        kge.a(-1077523422);
    }

    public static /* synthetic */ File access$100(DAIConfiguration dAIConfiguration) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("641c8e28", new Object[]{dAIConfiguration}) : dAIConfiguration.modelFilePath;
    }

    public static /* synthetic */ File access$102(DAIConfiguration dAIConfiguration, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("3f5cbc8f", new Object[]{dAIConfiguration, file});
        }
        dAIConfiguration.modelFilePath = file;
        return file;
    }

    public static /* synthetic */ DAIUserAdapter access$202(DAIConfiguration dAIConfiguration, DAIUserAdapter dAIUserAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DAIUserAdapter) ipChange.ipc$dispatch("6b79f4ae", new Object[]{dAIConfiguration, dAIUserAdapter});
        }
        dAIConfiguration.userAdapter = dAIUserAdapter;
        return dAIUserAdapter;
    }

    public static /* synthetic */ Class access$302(DAIConfiguration dAIConfiguration, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("445c6a81", new Object[]{dAIConfiguration, cls});
        }
        dAIConfiguration.userAdapterClass = cls;
        return cls;
    }

    public static /* synthetic */ boolean access$402(DAIConfiguration dAIConfiguration, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34310d4e", new Object[]{dAIConfiguration, new Boolean(z)})).booleanValue();
        }
        dAIConfiguration.debugMode = z;
        return z;
    }

    private DAIConfiguration() {
    }

    public Class<? extends DAIUserAdapter> getUserAdapterClass() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("77763c7e", new Object[]{this}) : this.userAdapterClass;
    }

    public DAIUserAdapter getUserAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DAIUserAdapter) ipChange.ipc$dispatch("b214ace0", new Object[]{this}) : this.userAdapter;
    }

    public File getModelFilePath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("316ef412", new Object[]{this}) : this.modelFilePath;
    }

    public boolean isDebugMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e1018317", new Object[]{this})).booleanValue() : this.debugMode;
    }

    /* loaded from: classes9.dex */
    public static final class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private DAIConfiguration config = new DAIConfiguration();
        private Context context;

        static {
            kge.a(-1468538631);
        }

        public Builder(Context context) {
            this.context = context;
        }

        public DAIConfiguration create() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DAIConfiguration) ipChange.ipc$dispatch("1b2deac0", new Object[]{this});
            }
            if (DAIConfiguration.access$100(this.config) == null) {
                DAIConfiguration dAIConfiguration = this.config;
                DAIConfiguration.access$102(dAIConfiguration, new File(this.context.getFilesDir() + rkp.a.MODEL_PATH));
            }
            return this.config;
        }

        public Builder setUserAdapter(DAIUserAdapter dAIUserAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("82aa4124", new Object[]{this, dAIUserAdapter});
            }
            DAIConfiguration.access$202(this.config, dAIUserAdapter);
            return this;
        }

        public Builder setUserAdapter(Class<? extends DAIUserAdapter> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("1ef7d198", new Object[]{this, cls});
            }
            DAIConfiguration.access$302(this.config, cls);
            return this;
        }

        public Builder setModelFilePath(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("37983a66", new Object[]{this, file});
            }
            DAIConfiguration.access$102(this.config, file);
            return this;
        }

        public Builder setDebugMode(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("4c901333", new Object[]{this, new Boolean(z)});
            }
            DAIConfiguration.access$402(this.config, z);
            return this;
        }

        public Builder setApiConfig(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("6593d508", new Object[]{this, map});
            }
            this.config.apiConfig = map;
            return this;
        }
    }
}
