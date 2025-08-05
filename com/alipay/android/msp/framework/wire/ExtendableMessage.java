package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.wire.ExtendableMessage;
import com.alipay.android.msp.framework.wire.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ExtendableMessage<T extends ExtendableMessage<?>> extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public transient ExtensionMap<T> f4888a;

    public <E> T setExtension(Extension<T, E> extension, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("afb8c992", new Object[]{this, extension, e});
        }
        ExtensionMap<T> extensionMap = this.f4888a;
        if (extensionMap == null) {
            this.f4888a = new ExtensionMap<>(extension, e);
        } else {
            extensionMap.put(extension, e);
        }
        return this;
    }

    public List<Extension<T, ?>> getExtensions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ead48a96", new Object[]{this});
        }
        ExtensionMap<T> extensionMap = this.f4888a;
        return extensionMap == null ? Collections.emptyList() : extensionMap.getExtensions();
    }

    public <E> E getExtension(Extension<T, E> extension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("baaecb03", new Object[]{this, extension});
        }
        ExtensionMap<T> extensionMap = this.f4888a;
        if (extensionMap != null) {
            return (E) extensionMap.get(extension);
        }
        return null;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        ExtensionMap<T> extensionMap = this.f4888a;
        return extensionMap == null ? "{}" : extensionMap.toString();
    }

    /* loaded from: classes3.dex */
    public static abstract class ExtendableBuilder<T extends ExtendableMessage<?>> extends Message.Builder<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ExtensionMap<T> f4889a;

        public <E> E getExtension(Extension<T, E> extension) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (E) ipChange.ipc$dispatch("baaecb03", new Object[]{this, extension});
            }
            ExtensionMap<T> extensionMap = this.f4889a;
            if (extensionMap != null) {
                return (E) extensionMap.get(extension);
            }
            return null;
        }

        public <E> ExtendableBuilder<T> setExtension(Extension<T, E> extension, E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExtendableBuilder) ipChange.ipc$dispatch("9cd8286f", new Object[]{this, extension, e});
            }
            ExtensionMap<T> extensionMap = this.f4889a;
            if (extensionMap == null) {
                this.f4889a = new ExtensionMap<>(extension, e);
            } else {
                extensionMap.put(extension, e);
            }
            return this;
        }
    }
}
