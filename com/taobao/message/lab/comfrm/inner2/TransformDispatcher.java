package com.taobao.message.lab.comfrm.inner2;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.config.TransformerItem;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class TransformDispatcher implements Transformer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mDispatcherType;
    private final List<CI<TransformerItem, Transformer>> mList;
    private Plugin mPlugin;
    private final SharedStateProxy mSharedStateProxy;

    static {
        kge.a(1777430834);
        kge.a(1437606424);
    }

    public TransformDispatcher(List<CI<TransformerItem, Transformer>> list, String str, boolean z, Plugin plugin) {
        this.mList = list;
        this.mDispatcherType = str;
        this.mPlugin = plugin;
        this.mSharedStateProxy = new SharedStateProxy(z);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Transformer
    public SharedState transform(Action action, SharedState sharedState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("e602685c", new Object[]{this, action, sharedState});
        }
        for (CI<TransformerItem, Transformer> ci : this.mList) {
            Plugin plugin = this.mPlugin;
            if (plugin != null) {
                plugin.onTransformerStart(action, ci.getConfig(), this.mDispatcherType);
            }
            this.mSharedStateProxy.reset(sharedState, ci.getConfig(), new Dependecy());
            sharedState = ci.getInstance().transform(action, this.mSharedStateProxy);
            if (sharedState instanceof SharedStateProxy) {
                sharedState = SharedStateProxy.access$000((SharedStateProxy) sharedState);
            }
            if (sharedState == null) {
                throw new RuntimeException("TransformDispatcher|" + ci.getConfig().name + "|不应该返回NULL");
            }
            Plugin plugin2 = this.mPlugin;
            if (plugin2 != null) {
                plugin2.onTransformerEnd(action, ci.getConfig(), this.mDispatcherType, SharedStateProxy.access$100(this.mSharedStateProxy));
            }
        }
        return sharedState;
    }

    /* loaded from: classes7.dex */
    public static class SharedStateProxy extends SharedState {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private TransformerItem cutTransformer;
        private Dependecy dependecy = new Dependecy();
        private SharedState dist;
        private boolean visitJs;

        static {
            kge.a(-1056330764);
        }

        public static /* synthetic */ SharedState access$000(SharedStateProxy sharedStateProxy) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SharedState) ipChange.ipc$dispatch("d8fe1ec4", new Object[]{sharedStateProxy}) : sharedStateProxy.dist;
        }

        public static /* synthetic */ Dependecy access$100(SharedStateProxy sharedStateProxy) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Dependecy) ipChange.ipc$dispatch("52e27de2", new Object[]{sharedStateProxy}) : sharedStateProxy.dependecy;
        }

        public SharedStateProxy(boolean z) {
            this.visitJs = z;
        }

        public void reset(SharedState sharedState, TransformerItem transformerItem, Dependecy dependecy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("796b2be8", new Object[]{this, sharedState, transformerItem, dependecy});
            } else if (ApplicationUtil.isDebug() && (sharedState instanceof SharedStateProxy)) {
                throw new IllegalStateException("state不应是一个代理");
            } else {
                this.dist = sharedState;
                this.cutTransformer = transformerItem;
                this.dependecy = dependecy;
            }
        }

        @Override // com.taobao.message.lab.comfrm.inner2.SharedState
        public <T> T getProp(String str, Class<T> cls, T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("3db65f23", new Object[]{this, str, cls, t});
            }
            if (!StringUtils.isEmpty(this.cutTransformer.instance)) {
                this.dependecy.readPropInstanceKeySet.add(new Pair<>(this.cutTransformer.instance, str));
                return (T) this.dist.getProp(this.cutTransformer.instance, str, cls, t);
            }
            this.dependecy.readPropKeySet.add(str);
            return (T) this.dist.getProp(str, cls, t);
        }

        @Override // com.taobao.message.lab.comfrm.inner2.SharedState
        public <T> T getOriginData(String str, Class<T> cls, T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("cfda46f0", new Object[]{this, str, cls, t});
            }
            if (!StringUtils.isEmpty(this.cutTransformer.instance)) {
                this.dependecy.readOriginDataInstanceKeySet.add(new Pair<>(this.cutTransformer.instance, str));
                return (T) this.dist.getOriginData(this.cutTransformer.instance, str, cls, t);
            }
            this.dependecy.readOriginDataKeySet.add(str);
            return (T) this.dist.getOriginData(str, cls, t);
        }

        @Override // com.taobao.message.lab.comfrm.inner2.SharedState
        public <T> T getRuntimeData(String str, Class<T> cls, T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("38672df6", new Object[]{this, str, cls, t});
            }
            if (!StringUtils.isEmpty(this.cutTransformer.instance)) {
                this.dependecy.readRuntimeDataInstanceKeySet.add(new Pair<>(this.cutTransformer.instance, str));
                return (T) this.dist.getRuntimeData(this.cutTransformer.instance, str, cls, t);
            }
            this.dependecy.readRuntimeDataKeySet.add(str);
            return (T) this.dist.getRuntimeData(str, cls, t);
        }

        @Override // com.taobao.message.lab.comfrm.inner2.SharedState
        public <T> T getJsRuntimeData(String str, Class<T> cls, T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("bb2025ad", new Object[]{this, str, cls, t});
            }
            if (!this.visitJs) {
                throw new IllegalStateException("visitJsRuntimeData|" + this.cutTransformer.type + "|key|" + str);
            } else if (!StringUtils.isEmpty(this.cutTransformer.instance)) {
                this.dependecy.readJsRuntimeDataInstanceKeySet.add(new Pair<>(this.cutTransformer.instance, str));
                return (T) this.dist.getRuntimeData(this.cutTransformer.instance, str, cls, t);
            } else {
                this.dependecy.readJsRuntimeDataKeySet.add(str);
                return (T) this.dist.getJsRuntimeData(str, cls, t);
            }
        }

        @Override // com.taobao.message.lab.comfrm.inner2.SharedState
        public <T> T getProp(String str, String str2, Class<T> cls, T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("1da3016d", new Object[]{this, str, str2, cls, t});
            }
            this.dependecy.readPropInstanceKeySet.add(new Pair<>(str, str2));
            return (T) this.dist.getProp(str, str2, cls, t);
        }

        @Override // com.taobao.message.lab.comfrm.inner2.SharedState
        public <T> T getOriginData(String str, String str2, Class<T> cls, T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("fcab6ffa", new Object[]{this, str, str2, cls, t});
            }
            this.dependecy.readOriginDataInstanceKeySet.add(new Pair<>(str, str2));
            return (T) this.dist.getOriginData(str, str2, cls, t);
        }

        @Override // com.taobao.message.lab.comfrm.inner2.SharedState
        public <T> T getRuntimeData(String str, String str2, Class<T> cls, T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("6a6ae180", new Object[]{this, str, str2, cls, t});
            }
            this.dependecy.readRuntimeDataInstanceKeySet.add(new Pair<>(str, str2));
            return (T) this.dist.getRuntimeData(str, str2, cls, t);
        }

        @Override // com.taobao.message.lab.comfrm.inner2.SharedState
        public <T> T getJsRuntimeData(String str, String str2, Class<T> cls, T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("183ff977", new Object[]{this, str, str2, cls, t});
            }
            if (!this.visitJs) {
                throw new IllegalStateException("visitJsRuntimeData|" + this.cutTransformer.type + "|key|" + str2 + "|instance|" + str);
            }
            this.dependecy.readJsRuntimeDataInstanceKeySet.add(new Pair<>(str, str2));
            return (T) this.dist.getJsRuntimeData(str, str2, cls, t);
        }

        @Override // com.taobao.message.lab.comfrm.inner2.SharedState
        public SharedState setDiff(Diff diff) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedState) ipChange.ipc$dispatch("a2b6a4d", new Object[]{this, diff});
            }
            if (diff instanceof DiffProxy) {
                diff = ((DiffProxy) diff).dist;
            }
            return this.dist.setDiff(diff);
        }

        @Override // com.taobao.message.lab.comfrm.inner2.SharedState
        public Diff getDiff() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Diff) ipChange.ipc$dispatch("e180228d", new Object[]{this}) : new DiffProxy(this.dist.getDiff(), this.cutTransformer);
        }

        @Override // com.taobao.message.lab.comfrm.inner2.SharedState
        public SharedState updateRuntimeData(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedState) ipChange.ipc$dispatch("91db0675", new Object[]{this, map});
            }
            if (!StringUtils.isEmpty(this.cutTransformer.instance)) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    this.dependecy.writeRuntimeDataInstanceKeyMap.put(new Pair<>(this.cutTransformer.instance, entry.getKey()), entry.getValue());
                }
                SharedState updateRuntimeData = this.dist.updateRuntimeData(this.cutTransformer.instance, map);
                SharedStateProxy sharedStateProxy = new SharedStateProxy(this.visitJs);
                sharedStateProxy.reset(updateRuntimeData, this.cutTransformer, this.dependecy);
                return sharedStateProxy;
            }
            for (Map.Entry<String, Object> entry2 : map.entrySet()) {
                this.dependecy.writeRuntimeDataKeyMap.put(entry2.getKey(), entry2.getValue());
            }
            SharedState updateRuntimeData2 = this.dist.updateRuntimeData(map);
            SharedStateProxy sharedStateProxy2 = new SharedStateProxy(this.visitJs);
            sharedStateProxy2.reset(updateRuntimeData2, this.cutTransformer, this.dependecy);
            return sharedStateProxy2;
        }

        @Override // com.taobao.message.lab.comfrm.inner2.SharedState
        public SharedState updateRuntimeData(String str, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedState) ipChange.ipc$dispatch("b3cf583f", new Object[]{this, str, map});
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                this.dependecy.writeRuntimeDataInstanceKeyMap.put(new Pair<>(str, entry.getKey()), entry.getValue());
            }
            SharedState updateRuntimeData = this.dist.updateRuntimeData(str, map);
            SharedStateProxy sharedStateProxy = new SharedStateProxy(this.visitJs);
            sharedStateProxy.reset(updateRuntimeData, this.cutTransformer, this.dependecy);
            return sharedStateProxy;
        }

        @Override // com.taobao.message.lab.comfrm.inner2.SharedState
        public SharedState addInstantOperation(List<Object> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedState) ipChange.ipc$dispatch("f0b124db", new Object[]{this, list});
            }
            this.dependecy.writeRuntimeDataKeyMap.put("__InstantOperation", list);
            SharedState addInstantOperation = this.dist.addInstantOperation(list);
            SharedStateProxy sharedStateProxy = new SharedStateProxy(this.visitJs);
            sharedStateProxy.reset(addInstantOperation, this.cutTransformer, this.dependecy);
            return sharedStateProxy;
        }

        @Override // com.taobao.message.lab.comfrm.inner2.SharedState
        public SharedState copy() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SharedState) ipChange.ipc$dispatch("25b23a3e", new Object[]{this}) : new SharedState(this.dist);
        }
    }

    /* loaded from: classes7.dex */
    public static class DiffProxy extends Diff {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public TransformerItem cutTransformer;
        public Diff dist;

        static {
            kge.a(-1769558953);
        }

        public DiffProxy(Diff diff, TransformerItem transformerItem) {
            if (ApplicationUtil.isDebug() && (diff instanceof DiffProxy)) {
                throw new IllegalStateException("dist不应是一个代理");
            }
            this.dist = diff;
            this.cutTransformer = transformerItem;
        }

        @Override // com.taobao.message.lab.comfrm.inner2.Diff
        public DeltaItem getOriginalDiff(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DeltaItem) ipChange.ipc$dispatch("8da067fe", new Object[]{this, str});
            }
            if (!StringUtils.isEmpty(this.cutTransformer.instance)) {
                return this.dist.getOriginalDiff(this.cutTransformer.instance, str);
            }
            return this.dist.getOriginalDiff(str);
        }

        @Override // com.taobao.message.lab.comfrm.inner2.Diff
        public DeltaItem getRuntimeDiff(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DeltaItem) ipChange.ipc$dispatch("52033203", new Object[]{this, str});
            }
            if (!StringUtils.isEmpty(this.cutTransformer.instance)) {
                return this.dist.getRuntimeDiff(this.cutTransformer.instance, str);
            }
            return this.dist.getRuntimeDiff(str);
        }

        @Override // com.taobao.message.lab.comfrm.inner2.Diff
        public Diff updateRuntimeDiff(Map<String, DeltaItem> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Diff) ipChange.ipc$dispatch("de71bd35", new Object[]{this, map});
            }
            if (!StringUtils.isEmpty(this.cutTransformer.instance)) {
                return new DiffProxy(this.dist.updateRuntimeDiff(this.cutTransformer.instance, map), this.cutTransformer);
            }
            return new DiffProxy(this.dist.updateRuntimeDiff(map), this.cutTransformer);
        }

        @Override // com.taobao.message.lab.comfrm.inner2.Diff
        public Diff updateRuntimeDiff(String str, Map<String, DeltaItem> map) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Diff) ipChange.ipc$dispatch("22cc036b", new Object[]{this, str, map}) : new DiffProxy(this.dist.updateRuntimeDiff(str, map), this.cutTransformer);
        }

        @Override // com.taobao.message.lab.comfrm.inner2.Diff
        public Diff merge(Diff diff, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Diff) ipChange.ipc$dispatch("db9e5419", new Object[]{this, diff, str, new Boolean(z)});
            }
            if (ApplicationUtil.isDebug()) {
                throw new UnsupportedOperationException();
            }
            return this.dist.merge(diff, str, z);
        }

        @Override // com.taobao.message.lab.comfrm.inner2.Diff
        public int getOriginalDiffSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d8398007", new Object[]{this})).intValue();
            }
            if (ApplicationUtil.isDebug()) {
                throw new UnsupportedOperationException();
            }
            return this.dist.getOriginalDiffSize();
        }

        @Override // com.taobao.message.lab.comfrm.inner2.Diff
        public int getRuntimeDiffSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7fb913e2", new Object[]{this})).intValue();
            }
            if (ApplicationUtil.isDebug()) {
                throw new UnsupportedOperationException();
            }
            return this.dist.getRuntimeDiffSize();
        }

        @Override // com.taobao.message.lab.comfrm.inner2.Diff
        public int getJsRuntimeDiffSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c2f1c559", new Object[]{this})).intValue();
            }
            if (ApplicationUtil.isDebug()) {
                throw new UnsupportedOperationException();
            }
            return this.dist.getJsRuntimeDiffSize();
        }

        @Override // com.taobao.message.lab.comfrm.inner2.Diff
        public Diff copy() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Diff) ipChange.ipc$dispatch("98243807", new Object[]{this}) : new Diff(this.dist);
        }
    }
}
