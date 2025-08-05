package com.alibaba.ariver.kernel.api.extension.registry;

import com.alibaba.android.umbrella.link.export.UMLLCons;
import com.alibaba.ariver.kernel.api.bytedata.ByteOrderDataUtil;
import com.alibaba.ariver.kernel.api.extension.ExtensionType;
import com.alibaba.ariver.kernel.api.node.Scope;
import com.alibaba.ariver.kernel.common.multiinstance.InstanceType;
import com.alibaba.ariver.kernel.common.multiinstance.MultiInstanceUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import mtopsdk.common.util.SymbolExpUtil;
import tb.kge;

/* loaded from: classes2.dex */
public class ExtensionMetaInfo extends NebulaConfigBase {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private InstanceType f2904a;
    public String bundleName;
    public String extensionClass;
    public List<String> filter;
    public String filterStrs;
    public boolean isLazy;
    public Class<? extends Scope> scope;
    public String scopeClassName;
    public ExtensionType type;
    public String typeString;

    static {
        kge.a(-837644524);
    }

    public static /* synthetic */ Object ipc$super(ExtensionMetaInfo extensionMetaInfo, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ExtensionMetaInfo(String str, String str2, String str3, Class<? extends Scope> cls) {
        this(str, str2, str3, cls, true);
    }

    public ExtensionMetaInfo(String str, String str2, String str3, boolean z) {
        this(str, str2, Collections.singletonList(str3), z);
    }

    public ExtensionMetaInfo(String str, String str2, String str3, Class<? extends Scope> cls, boolean z) {
        this(str, str2, Collections.singletonList(str3), cls, z);
    }

    public ExtensionMetaInfo(String str, String str2, List<String> list) {
        this(str, str2, list, true);
    }

    public ExtensionMetaInfo(String str, String str2, List<String> list, Class<? extends Scope> cls) {
        this(str, str2, list, cls, true);
    }

    public ExtensionMetaInfo(String str, String str2, List<String> list, boolean z) {
        this(str, str2, list, (Class<? extends Scope>) null, z);
    }

    public ExtensionMetaInfo(String str, String str2, List<String> list, Class<? extends Scope> cls, boolean z) {
        this(str, str2, list, cls, ExtensionType.NORMAL, z);
    }

    public ExtensionMetaInfo(String str, String str2, List<String> list, Class<? extends Scope> cls, ExtensionType extensionType, boolean z) {
        super((byte) 11);
        this.scope = null;
        this.bundleName = str;
        this.extensionClass = str2;
        this.isLazy = z;
        this.filter = list;
        this.scope = cls;
        this.type = extensionType;
    }

    public ExtensionMetaInfo(String str, String str2, String str3, String str4, String str5, boolean z) {
        super((byte) 11);
        this.scope = null;
        this.bundleName = str;
        this.extensionClass = str2;
        this.isLazy = z;
        this.filterStrs = str3;
        this.scopeClassName = str4;
        this.typeString = str5;
        this.filter = b(this.filterStrs);
        this.scope = a(str4);
        this.type = "normal".equals(this.typeString) ? ExtensionType.NORMAL : ExtensionType.BRIDGE;
    }

    public ExtensionMetaInfo instanceType(InstanceType instanceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtensionMetaInfo) ipChange.ipc$dispatch("28d0bd4b", new Object[]{this, instanceType});
        }
        this.f2904a = instanceType;
        return this;
    }

    public InstanceType getInstanceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InstanceType) ipChange.ipc$dispatch("7f0ff538", new Object[]{this});
        }
        if (this.f2904a == null) {
            this.f2904a = MultiInstanceUtils.getDefaultInstanceType();
        }
        return this.f2904a;
    }

    private Class<? extends Scope> a(String str) {
        String str2;
        Class cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("582938df", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            if ("App".equalsIgnoreCase(str)) {
                str2 = "com.alibaba.ariver.app.api.App";
            } else if (!UMLLCons.FEATURE_TYPE_PAGE.equalsIgnoreCase(str)) {
                return null;
            } else {
                str2 = "com.alibaba.ariver.app.api.Page";
            }
            cls = Class.forName(str2);
        } catch (Throwable th) {
            RVLogger.e("ExtensionMetaInfo", th);
        }
        if (!Scope.class.isAssignableFrom(cls)) {
            return null;
        }
        return cls;
    }

    private List<String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String replace = str.replace(" ", "");
        if (StringUtils.isEmpty(replace)) {
            return null;
        }
        RVLogger.d("ExtensionMetaInfo", "add event configs " + replace);
        return Arrays.asList(replace.split(SymbolExpUtil.SYMBOL_VERTICALBAR));
    }

    @Override // com.alibaba.ariver.kernel.api.extension.registry.NebulaConfigBase
    /* renamed from: serialize */
    public ExtensionMetaInfo mo167serialize(BufferedOutputStream bufferedOutputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtensionMetaInfo) ipChange.ipc$dispatch("d9fd2877", new Object[]{this, bufferedOutputStream});
        }
        ByteOrderDataUtil.writeByte(bufferedOutputStream, this.mFormatVersion);
        ByteOrderDataUtil.writeString(bufferedOutputStream, this.bundleName);
        ByteOrderDataUtil.writeString(bufferedOutputStream, this.filterStrs);
        ByteOrderDataUtil.writeString(bufferedOutputStream, this.extensionClass);
        ByteOrderDataUtil.writeBoolean(bufferedOutputStream, this.isLazy);
        ByteOrderDataUtil.writeString(bufferedOutputStream, this.scopeClassName);
        ByteOrderDataUtil.writeString(bufferedOutputStream, this.typeString);
        return this;
    }

    @Override // com.alibaba.ariver.kernel.api.extension.registry.NebulaConfigBase
    /* renamed from: deserialize */
    public ExtensionMetaInfo mo166deserialize(BufferedInputStream bufferedInputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtensionMetaInfo) ipChange.ipc$dispatch("590f1ee5", new Object[]{this, bufferedInputStream});
        }
        this.mFormatVersion = ByteOrderDataUtil.readByte(bufferedInputStream);
        this.bundleName = ByteOrderDataUtil.readString(bufferedInputStream);
        this.filterStrs = ByteOrderDataUtil.readString(bufferedInputStream);
        this.extensionClass = ByteOrderDataUtil.readString(bufferedInputStream);
        this.isLazy = ByteOrderDataUtil.readBoolean(bufferedInputStream);
        this.scopeClassName = ByteOrderDataUtil.readString(bufferedInputStream);
        this.typeString = ByteOrderDataUtil.readString(bufferedInputStream);
        this.filter = b(this.filterStrs);
        this.scope = a(this.scopeClassName);
        this.type = "normal".equals(this.typeString) ? ExtensionType.NORMAL : ExtensionType.BRIDGE;
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ExtensionMetaInfo{extensionClass=" + this.extensionClass + ",instanceType=" + getInstanceType() + ", filter=" + this.filter + ", type=" + this.typeString + ", instanceType=" + getInstanceType() + '}';
    }
}
