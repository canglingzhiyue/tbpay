package com.uc.webview.export.devtools;

import android.util.SparseArray;
import com.uc.webview.base.IExtender;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes9.dex */
public class InfoSource implements IExtender {
    private Map<String, InfoSource> mChildren;
    private final String mDesc;
    protected Observer mObserver;
    private final String mUUID;

    /* loaded from: classes9.dex */
    public interface Observer {
        void onMessage(String str, String str2, String str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uc.webview.export.devtools.InfoSource$a$a  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public static class C1040a {

            /* renamed from: a  reason: collision with root package name */
            private static SparseArray<String> f23822a;

            static {
                SparseArray<String> sparseArray = new SparseArray<>(10);
                f23822a = sparseArray;
                sparseArray.append(123, "&#x7B;");
                f23822a.append(125, "&#x7D;");
                f23822a.append(38, "&amp;");
                f23822a.append(39, "&#x27;");
                f23822a.append(34, "&quot;");
                f23822a.append(92, "&#x5C;");
            }
        }

        static <T> String a(T t) {
            if (t == null) {
                return "\"\"";
            }
            String valueOf = t instanceof String ? (String) t : String.valueOf(t);
            return "\"" + a(valueOf) + "\"";
        }

        static String a(String str) {
            StringBuilder sb = new StringBuilder(str.length() << 1);
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                String str2 = (String) C1040a.f23822a.get(charAt);
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append(charAt);
                }
            }
            return sb.toString();
        }

        static <T> StringBuilder a(StringBuilder sb, String str, T t) {
            sb.append(a(str));
            sb.append(riy.CONDITION_IF_MIDDLE);
            sb.append(a(t));
            sb.append(',');
            return sb;
        }
    }

    protected InfoSource(String str, String str2) {
        this.mUUID = str;
        this.mDesc = str2;
    }

    public static final <T> StringBuilder appendToJson(StringBuilder sb, T t) {
        sb.append(a.a(t));
        sb.append(',');
        return sb;
    }

    public static final <T> StringBuilder appendToJson(StringBuilder sb, String str, T t) {
        return a.a(sb, str, t);
    }

    public static final <T> StringBuilder appendToJson(StringBuilder sb, String str, T[] tArr) {
        sb.append(a.a(str));
        sb.append(":[");
        if (tArr != null && tArr.length > 0) {
            for (T t : tArr) {
                sb.append(a.a(t));
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
        }
        sb.append("],");
        return sb;
    }

    public static final String htmlEncode(String str) {
        return a.a(str);
    }

    private final Object locker() {
        return this.mUUID;
    }

    public final void addChild(InfoSource infoSource) {
        synchronized (locker()) {
            if (this.mChildren == null) {
                this.mChildren = new HashMap();
            }
            this.mChildren.put(infoSource.mUUID, infoSource);
        }
    }

    protected StringBuilder appendToJson(StringBuilder sb) {
        a.a(sb, "uuid", this.mUUID);
        a.a(sb, "desc", this.mDesc);
        return sb;
    }

    public final String desc() {
        return this.mDesc;
    }

    public final Map<String, InfoSource> getChildren() {
        HashMap hashMap;
        synchronized (locker()) {
            if (this.mChildren == null || this.mChildren.isEmpty()) {
                hashMap = null;
            } else {
                hashMap = new HashMap(this.mChildren.size());
                for (String str : this.mChildren.keySet()) {
                    hashMap.put(str, this.mChildren.get(str));
                }
            }
        }
        return hashMap;
    }

    public final String getValue(String str) {
        if (!this.mUUID.equals(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(riy.BLOCK_START_STR);
        appendToJson(sb);
        synchronized (locker()) {
            if (this.mChildren != null && !this.mChildren.isEmpty()) {
                sb.setLength(sb.length() - 1);
                sb.append("\"children\": [");
                for (String str2 : this.mChildren.keySet()) {
                    InfoSource infoSource = this.mChildren.get(str2);
                    sb.append(infoSource.getValue(infoSource.mUUID));
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
                sb.append("],");
            }
        }
        sb.setLength(sb.length() - 1);
        sb.append(riy.BLOCK_END_STR);
        return sb.toString();
    }

    public final int hashCode() {
        return this.mUUID.hashCode();
    }

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        return null;
    }

    public final void setObserver(Observer observer) {
        synchronized (locker()) {
            this.mObserver = observer;
            if (this.mChildren != null && !this.mChildren.isEmpty()) {
                for (String str : this.mChildren.keySet()) {
                    this.mChildren.get(str).setObserver(observer);
                }
            }
        }
    }

    public boolean setValue(String str, String str2, String str3) {
        return false;
    }

    public final String uuid() {
        return this.mUUID;
    }
}
