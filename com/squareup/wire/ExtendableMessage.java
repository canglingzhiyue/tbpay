package com.squareup.wire;

import com.squareup.wire.ExtendableMessage;
import com.squareup.wire.Message;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ExtendableMessage<T extends ExtendableMessage<?>> extends Message {
    transient d<T> extensionMap;

    /* loaded from: classes4.dex */
    public static abstract class a<T extends ExtendableMessage<?>> extends Message.a<T> {

        /* renamed from: a  reason: collision with root package name */
        d<T> f8112a;
    }

    protected ExtendableMessage() {
    }

    protected ExtendableMessage(ExtendableMessage<T> extendableMessage) {
        super(extendableMessage);
        d<T> dVar;
        if (extendableMessage == null || (dVar = extendableMessage.extensionMap) == null) {
            return;
        }
        this.extensionMap = new d<>(dVar);
    }

    protected boolean extensionsEqual(ExtendableMessage<T> extendableMessage) {
        d<T> dVar = this.extensionMap;
        return dVar == null ? extendableMessage.extensionMap == null : dVar.equals(extendableMessage.extensionMap);
    }

    protected int extensionsHashCode() {
        d<T> dVar = this.extensionMap;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String extensionsToString() {
        d<T> dVar = this.extensionMap;
        return dVar == null ? "{}" : dVar.toString();
    }

    public <E> E getExtension(c<T, E> cVar) {
        d<T> dVar = this.extensionMap;
        if (dVar == null) {
            return null;
        }
        return (E) dVar.a(cVar);
    }

    public List<c<T, ?>> getExtensions() {
        d<T> dVar = this.extensionMap;
        return dVar == null ? Collections.emptyList() : dVar.b();
    }

    protected void setBuilder(a<T> aVar) {
        super.setBuilder((Message.a) aVar);
        if (aVar.f8112a != null) {
            this.extensionMap = new d<>(aVar.f8112a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E> T setExtension(c<T, E> cVar, E e) {
        d<T> dVar = this.extensionMap;
        if (dVar == null) {
            this.extensionMap = new d<>(cVar, e);
        } else {
            dVar.a(cVar, e);
        }
        return this;
    }
}
