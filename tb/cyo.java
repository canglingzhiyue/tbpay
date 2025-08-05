package tb;

import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;

/* loaded from: classes4.dex */
public class cyo {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f26602a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final String[] b;

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", ErrorType.NETWORK, "net", "or", "org"};
        b = strArr;
        Arrays.sort(strArr);
    }

    public static final void a(String str, X509Certificate x509Certificate, boolean z) throws SSLException {
        String[] a2;
        String[] b2;
        String str2 = "cn is : " + Arrays.toString(a2);
        String str3 = "san is : " + Arrays.toString(b2);
        a(str, a(x509Certificate), b(x509Certificate), z);
    }

    public static final void a(String str, String[] strArr, String[] strArr2, boolean z) throws SSLException {
        LinkedList linkedList = new LinkedList();
        if (strArr != null && strArr.length > 0 && strArr[0] != null) {
            linkedList.add(strArr[0]);
        }
        if (strArr2 != null) {
            for (String str2 : strArr2) {
                if (str2 != null) {
                    linkedList.add(str2);
                }
            }
        }
        if (linkedList.isEmpty()) {
            throw new SSLException("Certificate for <" + str + "> doesn't contain CN or DNS subjectAlt");
        }
        StringBuffer stringBuffer = new StringBuffer();
        String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        Iterator it = linkedList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ENGLISH);
            stringBuffer.append(" <");
            stringBuffer.append(lowerCase2);
            stringBuffer.append('>');
            if (it.hasNext()) {
                stringBuffer.append(" OR");
            }
            if (lowerCase2.startsWith("*.") && lowerCase2.indexOf(46, 2) != -1 && a(lowerCase2) && !c(str)) {
                boolean endsWith = lowerCase.endsWith(lowerCase2.substring(1));
                if (!endsWith || !z) {
                    z2 = endsWith;
                    continue;
                } else if (b(lowerCase) == b(lowerCase2)) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
            } else {
                z2 = lowerCase.equals(lowerCase2);
                continue;
            }
            if (z2) {
                break;
            }
        }
        if (z2) {
            return;
        }
        throw new SSLException("hostname in certificate didn't match: <" + str + "> !=" + ((Object) stringBuffer));
    }

    public static boolean a(String str) {
        int length = str.length();
        if (length >= 7 && length <= 9) {
            int i = length - 3;
            if (str.charAt(i) == '.') {
                return Arrays.binarySearch(b, str.substring(2, i)) < 0;
            }
        }
        return true;
    }

    public static String[] a(X509Certificate x509Certificate) {
        List<String> a2 = new cyn(x509Certificate.getSubjectX500Principal()).a(AdvanceSetting.CLEAR_NOTIFICATION);
        if (!a2.isEmpty()) {
            String[] strArr = new String[a2.size()];
            a2.toArray(strArr);
            return strArr;
        }
        return null;
    }

    public static int b(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        return i;
    }

    public static String[] b(X509Certificate x509Certificate) {
        Collection<List<?>> collection;
        LinkedList linkedList = new LinkedList();
        try {
            collection = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e) {
            cyu.a("", "Error parsing certificate.", e);
            collection = null;
        }
        if (collection != null) {
            for (List<?> list : collection) {
                if (((Integer) list.get(0)).intValue() == 2) {
                    linkedList.add((String) list.get(1));
                }
            }
        }
        if (!linkedList.isEmpty()) {
            String[] strArr = new String[linkedList.size()];
            linkedList.toArray(strArr);
            return strArr;
        }
        return null;
    }

    private static boolean c(String str) {
        return f26602a.matcher(str).matches();
    }
}
