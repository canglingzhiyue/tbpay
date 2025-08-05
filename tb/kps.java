package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes4.dex */
public class kps {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1458816217);
    }

    private static int a(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8217d08", new Object[]{new Character(c)})).intValue();
        }
        if ('0' <= c && c <= '9') {
            return c - '0';
        }
        if ('a' <= c && c <= 'f') {
            return (c + '\n') - 97;
        }
        if ('A' <= c && c <= 'F') {
            return (c + '\n') - 65;
        }
        return -1;
    }

    public static int a(StringBuilder sb, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c006dcc9", new Object[]{sb, str, new Integer(i)})).intValue();
        }
        int length = sb.length();
        int length2 = str.length();
        if (i >= length) {
            if (length2 != 0) {
                return -1;
            }
            return length;
        }
        if (i < 0) {
            i = 0;
        }
        if (length2 == 0) {
            return i;
        }
        char charAt = str.charAt(0);
        int i2 = length - length2;
        while (i <= i2) {
            if (sb.charAt(i) != charAt) {
                do {
                    i++;
                    if (i > i2) {
                        break;
                    }
                } while (sb.charAt(i) != charAt);
            }
            if (i <= i2) {
                int i3 = i + 1;
                int i4 = (i3 + length2) - 1;
                for (int i5 = 1; i3 < i4 && sb.charAt(i3) == str.charAt(i5); i5++) {
                    i3++;
                }
                if (i3 == i4) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    public static void a(StringBuilder sb, String str, String str2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e97b4057", new Object[]{sb, str, str2});
            return;
        }
        while (true) {
            int a2 = a(sb, str, i);
            if (a2 < 0) {
                return;
            }
            sb.replace(a2, str.length() + a2, str2);
            i = a2 + str2.length();
        }
    }

    public static int a(String str, String str2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{str, str2})).intValue();
        }
        int i2 = 0;
        while (true) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf < 0) {
                return i2;
            }
            i2++;
            i = str2.length() + indexOf;
        }
    }

    public static String a(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("96fd423d", new Object[]{sb}) : a(sb, false, StandardCharsets.UTF_8, false);
    }

    private static String a(StringBuilder sb, boolean z, Charset charset, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7bb5500b", new Object[]{sb, new Boolean(z), charset, new Boolean(z2)});
        }
        StringBuilder sb2 = new StringBuilder(sb.length());
        a(sb2, sb, z, charset, z2);
        return sb2.toString();
    }

    private static void a(StringBuilder sb, StringBuilder sb2, boolean z, Charset charset, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("140813ba", new Object[]{sb, sb2, new Boolean(z), charset, new Boolean(z2)});
            return;
        }
        CharsetDecoder onUnmappableCharacter = charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).replaceWith("�").onUnmappableCharacter(CodingErrorAction.REPORT);
        ByteBuffer allocate = ByteBuffer.allocate(sb2.length());
        int i = 0;
        while (i < sb2.length()) {
            char charAt = sb2.charAt(i);
            i++;
            if (charAt != '%') {
                char c = '+';
                if (charAt == '+') {
                    a(sb, onUnmappableCharacter, allocate, z2);
                    if (z) {
                        c = ' ';
                    }
                    sb.append(c);
                } else {
                    a(sb, onUnmappableCharacter, allocate, z2);
                    sb.append(charAt);
                }
            } else {
                int i2 = i;
                int i3 = 0;
                byte b = 0;
                while (true) {
                    if (i3 >= 2) {
                        break;
                    }
                    try {
                        char a2 = a(sb2, i2, sb2.length(), (String) null);
                        i2++;
                        int a3 = a(a2);
                        if (a3 >= 0) {
                            b = (byte) ((b << 4) + a3);
                            i3++;
                        } else if (z2) {
                            throw new IllegalArgumentException(a(sb2, (String) null, a2, i2 - 1));
                        } else {
                            a(sb, onUnmappableCharacter, allocate, z2);
                            sb.append((char) 65533);
                        }
                    } catch (URISyntaxException e) {
                        if (z2) {
                            throw new IllegalArgumentException(e);
                        }
                        a(sb, onUnmappableCharacter, allocate, z2);
                        sb.append((char) 65533);
                        return;
                    }
                }
                i = i2;
                allocate.put(b);
            }
        }
        a(sb, onUnmappableCharacter, allocate, z2);
    }

    private static void a(StringBuilder sb, CharsetDecoder charsetDecoder, ByteBuffer byteBuffer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3edbade", new Object[]{sb, charsetDecoder, byteBuffer, new Boolean(z)});
        } else if (byteBuffer.position() == 0) {
        } else {
            byteBuffer.flip();
            try {
                sb.append((CharSequence) charsetDecoder.decode(byteBuffer));
            } catch (CharacterCodingException e) {
                if (z) {
                    throw new IllegalArgumentException(e);
                }
                sb.append((char) 65533);
            } finally {
                byteBuffer.flip();
                byteBuffer.limit(byteBuffer.capacity());
            }
        }
    }

    private static URISyntaxException a(StringBuilder sb, String str, char c, int i) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URISyntaxException) ipChange.ipc$dispatch("786afa45", new Object[]{sb, str, new Character(c), new Integer(i)});
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = " in [" + str + riy.ARRAY_END_STR;
        }
        return new URISyntaxException(sb.toString(), "Unexpected character" + str2 + ResponseProtocolType.COMMENT + c, i);
    }

    private static char a(StringBuilder sb, int i, int i2, String str) throws URISyntaxException {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Character) ipChange.ipc$dispatch("3a85235a", new Object[]{sb, new Integer(i), new Integer(i2), str})).charValue();
        }
        if (i >= i2) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = " in [" + str + riy.ARRAY_END_STR;
            }
            throw new URISyntaxException(sb.toString(), "Unexpected end of string" + str2, i);
        }
        return sb.charAt(i);
    }
}
