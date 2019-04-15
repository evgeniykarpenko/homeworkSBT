### JIT
    Запуск с опцией: -XX:+PrintCompilation
    149    1       3       java.util.concurrent.ConcurrentHashMap::tabAt (22 bytes)
        150    2       3       jdk.internal.misc.Unsafe::getObjectAcquire (7 bytes)
        153    3       3       java.lang.String::isLatin1 (19 bytes)
        162    4       3       java.lang.StringLatin1::hashCode (42 bytes)
        163    5       3       java.lang.String::coder (15 bytes)
        163    6       3       java.lang.Object::<init> (1 bytes)
        163    7       3       java.lang.String::hashCode (49 bytes)
        164    8       3       java.lang.Math::floorMod (10 bytes)
        164   10       3       java.util.ImmutableCollections$SetN::probe (60 bytes)
        165    9       3       java.lang.Math::floorDiv (22 bytes)
        166   12       3       java.lang.StringLatin1::equals (36 bytes)
        166   11       3       java.lang.String::equals (65 bytes)
        167   13       1       java.util.ImmutableCollections$Set0::hashCode (2 bytes)
        168   14       1       java.util.Collections$EmptySet::hashCode (2 bytes)
        169   15       3       java.util.Collections::emptySet (4 bytes)
        169   17       3       java.util.Objects::equals (23 bytes)
        170   18       4       java.lang.StringLatin1::hashCode (42 bytes)
        170   16       3       java.lang.module.ModuleDescriptor$Exports::<init> (10 bytes)
        171   19       3       java.util.Objects::requireNonNull (14 bytes)
        172   20       3       java.lang.module.ModuleDescriptor$Exports::hashCode (38 bytes)
        172   21       3       jdk.internal.module.Builder::newExports (11 bytes)
        173   23       1       java.lang.Object::<init> (1 bytes)
        173    6       3       java.lang.Object::<init> (1 bytes)   made not entrant
        173   22       3       java.lang.module.ModuleDescriptor$1::newExports (15 bytes)
        174   24       3       java.util.AbstractSet::<init> (5 bytes)
        174   25       3       java.lang.module.ModuleDescriptor$Exports::equals (62 bytes)
        175   26       3       java.util.ImmutableCollections$Set1::hashCode (8 bytes)
        176   27       3       java.util.Set::of (66 bytes)
        176   28       1       java.util.Collections$EmptySet::contains (2 bytes)
        177   29       3       jdk.internal.module.Builder::newRequires (7 bytes)
        177   30       3       jdk.internal.module.Builder::newRequires (51 bytes)
        177    4       3       java.lang.StringLatin1::hashCode (42 bytes)   made not entrant
        178   31       3       java.lang.module.ModuleDescriptor$Requires::hashCode (63 bytes)
        181   32       1       java.lang.module.ModuleDescriptor::name (5 bytes)
        181   33     n 0       java.lang.System::arraycopy (native)   (static)
        181   34       1       java.lang.module.ModuleReference::descriptor (5 bytes)
        182   35       3       java.lang.String::charAt (25 bytes)
        183   37       3       java.net.URI::hash (33 bytes)
        184   36       3       java.lang.StringLatin1::charAt (28 bytes)
        187   38       3       java.lang.StringUTF16::getChar (60 bytes)
        191   39       3       java.lang.String::length (11 bytes)
        196   40       3       java.util.concurrent.ConcurrentHashMap::spread (10 bytes)
        196   41       3       java.util.ImmutableCollections$SetN$1::hasNext (47 bytes)
        196   42       3       java.util.ImmutableCollections$SetN$1::next (35 bytes)
        198   43       3       java.util.HashMap::hash (20 bytes)
        201   44       3       java.util.ImmutableCollections$MapN::probe (64 bytes)
        202   45       1       java.lang.module.ModuleDescriptor$Requires::modifiers (5 bytes)
        203   48       3       java.util.HashMap::putVal (300 bytes)
        205   50       3       java.util.HashMap::newNode (13 bytes)
        205   54       4       java.lang.String::hashCode (49 bytes)
        205   55       3       java.util.HashMap::getNode (148 bytes)
        206   46       1       java.lang.module.ModuleDescriptor$Requires::name (5 bytes)
        207   47       3       java.util.HashMap::put (13 bytes)
        207   49       3       java.util.HashMap$Node::<init> (26 bytes)
        208   56       3       java.util.HashMap::afterNodeInsertion (1 bytes)
        208   52       1       java.util.Collections$1::hasNext (5 bytes)
        208   51       1       java.lang.module.ModuleDescriptor::provides (5 bytes)
        208   57       3       java.lang.module.ModuleDescriptor::hashCode (170 bytes)
        210   58       3       java.util.HashMap::containsKey (18 bytes)
        211   59       3       java.util.HashMap::get (23 bytes)
        211   53       1       java.util.ImmutableCollections$Set1::size (2 bytes)
        212   60       3       java.util.HashSet::add (20 bytes)
        212   61       1       java.lang.module.ModuleDescriptor::requires (5 bytes)
        213   62       3       java.util.HashMap$HashIterator::hasNext (13 bytes)
        213   63       3       java.lang.module.Resolver::visit (148 bytes)
        214    7       3       java.lang.String::hashCode (49 bytes)   made not entrant
        215   65       3       java.util.HashMap$HashIterator::nextNode (100 bytes)
        216   64       3       java.util.HashSet::contains (9 bytes)
        217   66       3       java.util.HashMap$KeyIterator::next (8 bytes)
        218   67       3       jdk.internal.module.ModuleReferenceImpl::hashCode (56 bytes)
        218   68     n 0       java.lang.Object::hashCode (native)   
        219   69       3       java.util.HashMap$ValueIterator::next (8 bytes)
        220   70       3       java.lang.module.ResolvedModule::hashCode (16 bytes)
        220   71       1       java.lang.module.ModuleDescriptor::isAutomatic (5 bytes)
        221   72       3       java.lang.module.Resolver::computeIfAbsent (42 bytes)
        222   73       3       java.util.ImmutableCollections$Set1::contains (9 bytes)
        222   74       3       java.lang.Enum::equals (11 bytes)
        223   75       3       java.util.HashMap$HashIterator::<init> (79 bytes)
        223   78       3       java.util.HashMap$KeyIterator::<init> (11 bytes)
        224   79       3       java.util.HashSet::iterator (13 bytes)
        224   76       3       java.util.HashMap::keySet (25 bytes)
        225   77       3       java.util.HashMap$KeySet::iterator (12 bytes)
        225   81       3       java.util.AbstractCollection::isEmpty (13 bytes)
        225   80       3       java.lang.module.ModuleDescriptor$Exports::isQualified (18 bytes)
        226   82       1       java.util.Collections$EmptySet::isEmpty (2 bytes)
        226   83       1       java.lang.module.ModuleDescriptor$Exports::source (5 bytes)
        226   85       1       java.util.HashMap::afterNodeInsertion (1 bytes)
        226   56       3       java.util.HashMap::afterNodeInsertion (1 bytes)   made not entrant
        226   87       3       java.util.HashMap::putIfAbsent (13 bytes)
        227   84       1       java.lang.module.ModuleDescriptor$Exports::targets (5 bytes)
        227   86       1       java.util.ImmutableCollections$SetN::size (5 bytes)
        227   88       1       java.util.ImmutableCollections$Set2::size (2 bytes)
        227   89       4       java.util.ImmutableCollections$SetN$1::hasNext (47 bytes)
        228   90       3       java.util.HashMap::resize (356 bytes)
        230   91       3       java.util.ImmutableCollections$SetN::contains (14 bytes)
        230   92       3       java.util.HashMap::<init> (11 bytes)
        231   41       3       java.util.ImmutableCollections$SetN$1::hasNext (47 bytes)   made not entrant
        231   93       4       java.lang.String::coder (15 bytes)
        232    5       3       java.lang.String::coder (15 bytes)   made not entrant
        232   94       3       java.util.ImmutableCollections$Set2::contains (28 bytes)
        232   95       1       java.lang.module.ModuleDescriptor::uses (5 bytes)
        233   96       1       java.lang.module.ModuleDescriptor::exports (5 bytes)
        234   97       3       java.util.ImmutableCollections$Set2$1::hasNext (14 bytes)
        235   98       4       java.util.ImmutableCollections$SetN$1::next (35 bytes)
        235   99       3       java.util.HashSet::<init> (16 bytes)
        235  100       1       java.lang.module.ResolvedModule::reference (5 bytes)
        236  101       3       java.util.ImmutableCollections$SetN::iterator (9 bytes)
        238  102       3       java.lang.Math::min (11 bytes)
        238  103       4       java.lang.module.ModuleDescriptor$Exports::isQualified (18 bytes)
        239   80       3       java.lang.module.ModuleDescriptor$Exports::isQualified (18 bytes)   made not entrant
        239  104       4       java.lang.String::equals (65 bytes)
        240   42       3       java.util.ImmutableCollections$SetN$1::next (35 bytes)   made not entrant
        240  105       4       java.util.HashMap::putVal (300 bytes)
        240  107       3       java.lang.StringLatin1::lastIndexOf (125 bytes)
        241  109       1       java.lang.module.ModuleDescriptor$Provides::service (5 bytes)
        242  110       3       java.lang.String::<init> (15 bytes)
        243  111       3       java.lang.module.ResolvedModule::descriptor (8 bytes)
        243   11       3       java.lang.String::equals (65 bytes)   made not entrant
        243  106       4       java.util.HashMap::newNode (13 bytes)
        249  112       1       java.util.KeyValueHolder::getKey (5 bytes)
        249  113       1       java.util.KeyValueHolder::getValue (5 bytes)
        250   50       3       java.util.HashMap::newNode (13 bytes)   made not entrant
        250  108       4       java.lang.String::isLatin1 (19 bytes)
        251  114       3       java.util.concurrent.ConcurrentHashMap::addCount (289 bytes)
        251    3       3       java.lang.String::isLatin1 (19 bytes)   made not entrant
        251  115     n 0       jdk.internal.misc.Unsafe::compareAndSetLong (native)   
        252    1       3       java.util.concurrent.ConcurrentHashMap::tabAt (22 bytes)   made not entrant
        253  118     n 0       jdk.internal.misc.Unsafe::compareAndSetObject (native)   
        254  120       3       java.util.concurrent.ConcurrentHashMap::tabAt (22 bytes)
        254  116   !   3       java.util.concurrent.ConcurrentHashMap::putVal (432 bytes)
        259  123       1       java.util.concurrent.ConcurrentHashMap::spread (10 bytes)
        259   40       3       java.util.concurrent.ConcurrentHashMap::spread (10 bytes)   made not entrant
        259  124       3       java.util.AbstractCollection::<init> (5 bytes)
        260  121       3       java.util.concurrent.ConcurrentHashMap::putIfAbsent (8 bytes)
        260  117       3       java.util.concurrent.ConcurrentHashMap$Node::<init> (20 bytes)
        261  119       3       java.util.concurrent.ConcurrentHashMap::casTabAt (21 bytes)
        261  126       3       java.util.Optional::ofNullable (15 bytes)
        262  122       1       java.lang.module.ModuleDescriptor::packages (5 bytes)
        262  125       1       java.lang.module.ModuleDescriptor$Version::toString (5 bytes)
        262  127       3       java.lang.AbstractStringBuilder::ensureCapacityInternal (39 bytes)
        263  128       3       java.net.URI::isOpaque (13 bytes)
        264  129       1       java.util.ImmutableCollections$Set0::size (2 bytes)
        265  130       3       java.lang.module.ResolvedModule::name (11 bytes)
        266  132       3       java.util.Collections$UnmodifiableCollection$1::hasNext (10 bytes)
        266  131       1       java.lang.module.ResolvedModule::configuration (5 bytes)
        266  133     n 0       java.lang.Module::addExports0 (native)   (static)
        266  134       1       java.lang.module.ModuleDescriptor::isOpen (5 bytes)
        267  135       3       java.util.ImmutableCollections$Set1::iterator (8 bytes)
        267  136       3       java.util.Collections::singletonIterator (9 bytes)
        268  137       3       java.util.Collections$1::<init> (15 bytes)
        268  138       3       java.util.Collections$1::next (25 bytes)
        268  139       3       java.util.ImmutableCollections$Set2$1::next (49 bytes)
        269  140       1       java.util.Collections$EmptyMap::get (2 bytes)
        269  141       1       java.util.Collections$EmptyIterator::hasNext (2 bytes)
        270  142       3       java.util.concurrent.ConcurrentHashMap::setTabAt (20 bytes)
        271  143       3       jdk.internal.misc.Unsafe::putObjectRelease (9 bytes)
        271  144       1       jdk.internal.module.ModuleReferenceImpl::moduleResolution (5 bytes)
        272  145       4       java.util.ImmutableCollections$SetN::probe (60 bytes)
        273  146       3       java.util.ImmutableCollections$SetN::<init> (90 bytes)
        275  147       3       java.util.Map::entry (10 bytes)
        279   10       3       java.util.ImmutableCollections$SetN::probe (60 bytes)   made not entrant
        279  148       1       java.lang.Module::getDescriptor (5 bytes)
        279  149       4       java.util.HashMap::putIfAbsent (13 bytes)
        280  150       3       jdk.internal.module.ModuleBootstrap$2::hasNext (30 bytes)
        280  151       3       jdk.internal.module.ModuleBootstrap$2::next (52 bytes)
        282  152     n 0       java.lang.Module::addExportsToAllUnnamed0 (native)   (static)
        282  153       3       java.util.ImmutableCollections$Set0::instance (4 bytes)
        283  154       3       java.util.Collections$UnmodifiableCollection$1::next (10 bytes)
        284  156       3       java.util.ImmutableCollections$MapN::get (21 bytes)
        288   48       3       java.util.HashMap::putVal (300 bytes)   made not entrant
        288  155       4       java.util.HashMap::resize (356 bytes)
        296  157       3       java.lang.StringLatin1::indexOf (61 bytes)
        300   54       4       java.lang.String::hashCode (49 bytes)   made not entrant
        300  158       3       java.lang.String::hashCode (49 bytes)
        310  159       3       java.lang.StringUTF16::putChar (54 bytes)
        310  104       4       java.lang.String::equals (65 bytes)   made not entrant
        310  161       3       java.lang.AbstractStringBuilder::isLatin1 (19 bytes)
        311  162       3       java.lang.StringUTF16::checkIndex (9 bytes)
        311  163       3       java.lang.String::checkIndex (46 bytes)
        312  160       3       java.lang.StringUTF16::length (5 bytes)
        315  164       3       java.lang.StringBuilder::append (8 bytes)
        315  166       3       java.lang.StringLatin1::canEncode (13 bytes)
        315  165       3       java.lang.AbstractStringBuilder::append (77 bytes)
        317  167       3       java.io.WinNTFileSystem::isSlash (18 bytes)
        317  168       3       java.lang.String::checkBoundsBeginEnd (60 bytes)
        320  169       3       java.lang.String::equals (65 bytes)
        327  170       3       java.lang.String::indexOf (29 bytes)
        330  171       3       java.lang.String::indexOf (7 bytes)
        333   87       3       java.util.HashMap::putIfAbsent (13 bytes)   made not entrant
        345   90       3       java.util.HashMap::resize (356 bytes)   made not entrant
        357  172       3       java.util.zip.ZipUtils::SH (21 bytes)
        357  173       3       java.lang.CharacterData::of (120 bytes)
        358  174       3       java.lang.CharacterDataLatin1::getProperties (11 bytes)
        358  175       3       java.lang.Character::toLowerCase (9 bytes)
        384  176       3       java.util.jar.Attributes$Name::isValid (32 bytes)
        385  177       3       java.util.jar.Attributes$Name::isAlpha (30 bytes)
        386  178       3       java.lang.CharacterDataLatin1::toLowerCase (39 bytes)
        388  179       4       java.lang.StringLatin1::equals (36 bytes)
        393  180       3       java.lang.AbstractStringBuilder::putStringAt (29 bytes)
        393   12       3       java.lang.StringLatin1::equals (36 bytes)   made not entrant
        394  181       3       java.lang.AbstractStringBuilder::getCoder (15 bytes)
        394  183       3       sun.nio.fs.WindowsPathParser::isSlash (18 bytes)
        394  182       3       java.lang.String::getBytes (44 bytes)
        399  184       3       java.lang.StringLatin1::lastIndexOf (40 bytes)
        400  185       3       java.lang.String::substring (58 bytes)
        402  186       3       java.util.Arrays::copyOfRange (63 bytes)
        410  187       3       java.lang.System::getSecurityManager (4 bytes)
        413  188       3       java.lang.StringLatin1::newString (17 bytes)
        413  189       3       java.lang.StringBuilder::append (8 bytes)
        414  190       3       java.lang.AbstractStringBuilder::append (45 bytes)
        417   23       1       java.lang.Object::<init> (1 bytes)   made not entrant
        420  191       1       java.lang.reflect.Method::getName (5 bytes)
        420  192       1       java.lang.Object::<init> (1 bytes)
        428  193       1       java.lang.Class::getClassLoader0 (5 bytes)
        446  194       3       java.util.Objects::checkIndex (7 bytes)
        480  195       4       java.lang.String::charAt (25 bytes)
        480  196       3       sun.nio.fs.WindowsPathParser::isInvalidPathChar (22 bytes)
        481  197       3       java.util.concurrent.ConcurrentHashMap::get (162 bytes)
        483   35       3       java.lang.String::charAt (25 bytes)   made not entrant
        483  199       3       java.lang.StringBuilder::toString (35 bytes)
        483  204       3       java.lang.Integer::stringSize (47 bytes)
        484  205       3       java.lang.Integer::getChars (131 bytes)
        485  198       3       java.lang.AbstractStringBuilder::<init> (39 bytes)
        485  200       3       java.lang.StringBuilder::<init> (7 bytes)
        485  201       3       java.lang.Number::<init> (5 bytes)
        486  202       3       java.lang.Integer::<init> (10 bytes)
        486  203       3       java.lang.Integer::valueOf (32 bytes)
        486  210       4       java.util.HashMap::put (13 bytes)
        486  206       3       java.lang.StringBuilder::append (8 bytes)
        487  207       3       java.lang.AbstractStringBuilder::append (55 bytes)
        488  208       3       java.lang.Integer::hashCode (8 bytes)
        488  209       3       java.lang.Integer::hashCode (2 bytes)
        489   47       3       java.util.HashMap::put (13 bytes)   made not entrant
        490  211       4       java.lang.AbstractStringBuilder::ensureCapacityInternal (39 bytes)
        493  212       4       java.lang.Integer::stringSize (47 bytes)
        496  204       3       java.lang.Integer::stringSize (47 bytes)   made not entrant
        496  214       4       java.lang.StringBuilder::append (8 bytes)
        499  127       3       java.lang.AbstractStringBuilder::ensureCapacityInternal (39 bytes)   made not entrant
        499  215       4       java.lang.AbstractStringBuilder::append (45 bytes)
        514  189       3       java.lang.StringBuilder::append (8 bytes)   made not entrant
        514  218       4       java.lang.Integer::getChars (131 bytes)
        516  190       3       java.lang.AbstractStringBuilder::append (45 bytes)   made not entrant
        516  216       4       java.lang.String::getBytes (44 bytes)
        520  182       3       java.lang.String::getBytes (44 bytes)   made not entrant
        520  221       4       java.lang.Integer::valueOf (32 bytes)
        523  203       3       java.lang.Integer::valueOf (32 bytes)   made not entrant
        523  222       4       java.lang.StringBuilder::append (8 bytes)
        526  205       3       java.lang.Integer::getChars (131 bytes)   made not entrant
        526  223       4       java.lang.AbstractStringBuilder::append (55 bytes)
        567  206       3       java.lang.StringBuilder::append (8 bytes)   made not entrant
        567  213       4       java.util.Arrays::copyOfRange (63 bytes)
        572  186       3       java.util.Arrays::copyOfRange (63 bytes)   made not entrant
        572  217       4       java.lang.AbstractStringBuilder::<init> (39 bytes)
        573  207       3       java.lang.AbstractStringBuilder::append (55 bytes)   made not entrant
        573  219       4       java.lang.StringBuilder::toString (35 bytes)
        576  198       3       java.lang.AbstractStringBuilder::<init> (39 bytes)   made not entrant
        576  220       4       java.lang.StringBuilder::<init> (7 bytes)
        581  200       3       java.lang.StringBuilder::<init> (7 bytes)   made not entrant
        581  224       4       java.lang.Integer::hashCode (8 bytes)
        582  208       3       java.lang.Integer::hashCode (8 bytes)   made not entrant
        592  199       3       java.lang.StringBuilder::toString (35 bytes)   made not entrant
        604  225 %     3       Main::main @ 10 (53 bytes)
        606  226       3       Main::main (53 bytes)
        673  227 %     4       Main::main @ 10 (53 bytes)
        708  225 %     3       Main::main @ 10 (53 bytes)   made not entrant
       1561  227 %     4       Main::main @ 10 (53 bytes)   made not entrant
    Запуск с опциями: -XX:+PrintCompilation -XX:+UnlockDiagnosticVMOptions -XX:+PrintInlining
    116    1       3       java.util.concurrent.ConcurrentHashMap::tabAt (22 bytes)
                                  @ 15   jdk.internal.misc.Unsafe::getObjectAcquire (7 bytes)
                                    @ 3   jdk.internal.misc.Unsafe::getObjectVolatile (0 bytes)   intrinsic
        118    2       3       jdk.internal.misc.Unsafe::getObjectAcquire (7 bytes)
                                  @ 3   jdk.internal.misc.Unsafe::getObjectVolatile (0 bytes)   intrinsic
        118    3       3       java.lang.String::isLatin1 (19 bytes)
        130    4       3       java.lang.StringLatin1::hashCode (42 bytes)
        131    6       3       java.lang.Object::<init> (1 bytes)
        131    5       3       java.lang.String::coder (15 bytes)
        131    7       3       java.lang.String::hashCode (49 bytes)
                                  @ 19   java.lang.String::isLatin1 (19 bytes)
                                  @ 29   java.lang.StringLatin1::hashCode (42 bytes)   callee is too large
                                  @ 39   java.lang.StringUTF16::hashCode (33 bytes)
                                    @ 20   java.lang.StringUTF16::getChar (60 bytes)   intrinsic
        132    8       3       java.lang.Math::floorMod (10 bytes)
                                  @ 3   java.lang.Math::floorDiv (22 bytes)
        132    9       3       java.lang.Math::floorDiv (22 bytes)
        133   11       3       java.lang.StringLatin1::equals (36 bytes)
        133   10       3       java.util.ImmutableCollections$SetN::probe (60 bytes)
                                  @ 1   java.lang.Object::hashCode (0 bytes)   no static binding
                                  @ 13   java.lang.Math::floorMod (10 bytes)
                                    @ 3   java.lang.Math::floorDiv (22 bytes)
                                  @ 35   java.lang.Object::equals (11 bytes)   no static binding
        134   13       3       java.lang.String::equals (65 bytes)
                                  @ 20   java.lang.String::coder (15 bytes)
                                  @ 24   java.lang.String::coder (15 bytes)
                                  @ 31   java.lang.String::isLatin1 (19 bytes)
                                  @ 45   java.lang.StringLatin1::equals (36 bytes)   callee is too large
                                  @ 59   java.lang.StringUTF16::equals (44 bytes)   callee is too large
        136   14       3       java.util.Objects::equals (23 bytes)
                                  @ 11   java.lang.Object::equals (11 bytes)   no static binding
        136   12       1       java.util.ImmutableCollections$Set0::hashCode (2 bytes)
        136   15       1       java.util.Collections$EmptySet::hashCode (2 bytes)
        137   16       3       java.util.Collections::emptySet (4 bytes)
        138   19       4       java.lang.StringLatin1::hashCode (42 bytes)
        138   17       3       java.lang.module.ModuleDescriptor$Exports::<init> (10 bytes)
                                  @ 6   java.lang.module.ModuleDescriptor$Exports::<init> (20 bytes)
                                    @ 1   java.lang.Object::<init> (1 bytes)
        139   18       3       java.lang.module.ModuleDescriptor$Exports::hashCode (38 bytes)
                                  @ 4   java.util.Set::hashCode (0 bytes)   no static binding
                                  @ 18   java.lang.String::hashCode (49 bytes)   callee is too large
                                  @ 31   java.util.Set::hashCode (0 bytes)   no static binding
        140   20       3       java.util.Objects::requireNonNull (14 bytes)
                                  @ 8   java.lang.NullPointerException::<init> (5 bytes)   don't inline Throwable constructors
        140   21       3       jdk.internal.module.Builder::newExports (11 bytes)
                                  @ 5   java.lang.module.ModuleDescriptor$1::newExports (15 bytes)
                                    @ 6   java.util.Collections::emptySet (4 bytes)
                                    @ 11   java.lang.module.ModuleDescriptor$Exports::<init> (10 bytes)
                                      @ 6   java.lang.module.ModuleDescriptor$Exports::<init> (20 bytes)
                                        @ 1   java.lang.Object::<init> (1 bytes)
        142   23       1       java.lang.Object::<init> (1 bytes)
        142    6       3       java.lang.Object::<init> (1 bytes)   made not entrant
        142   22       3       java.lang.module.ModuleDescriptor$1::newExports (15 bytes)
                                  @ 6   java.util.Collections::emptySet (4 bytes)
                                  @ 11   java.lang.module.ModuleDescriptor$Exports::<init> (10 bytes)
                                    @ 6   java.lang.module.ModuleDescriptor$Exports::<init> (20 bytes)
                                          151    4       3       java.lang.StringLatin1::hashCode (42 bytes)   made not entrant
    @ 1   java.lang.Object::<init> (1 bytes)
        151   25       3       java.util.AbstractCollection::<init> (5 bytes)
                                  @ 1   java.lang.Object::<init> (1 bytes)
        152   27       3       java.util.AbstractSet::<init> (5 bytes)
                                  @ 1   java.util.AbstractCollection::<init> (5 bytes)
                                    @ 1   java.lang.Object::<init> (1 bytes)
        152   28       3       java.util.ImmutableCollections$AbstractImmutableSet::<init> (5 bytes)
                                  @ 1   java.util.AbstractSet::<init> (5 bytes)
                                    @ 1   java.util.AbstractCollection::<init> (5 bytes)
                                      @ 1   java.lang.Object::<init> (1 bytes)
        153   24       3       java.util.ImmutableCollections$Set1::hashCode (8 bytes)
                                  @ 4   java.lang.Object::hashCode (0 bytes)   no static binding
        153   26       1       java.util.Collections$EmptySet::contains (2 bytes)
        155   29       1       java.lang.module.ModuleDescriptor::name (5 bytes)
        155   30     n 0       java.lang.System::arraycopy (native)   (static)
        156   31       1       java.lang.module.ModuleReference::descriptor (5 bytes)
        156   32       3       java.lang.String::charAt (25 bytes)
                                  @ 1   java.lang.String::isLatin1 (19 bytes)
                                  @ 12   java.lang.StringLatin1::charAt (28 bytes)
                                    @ 15  java/lang/StringIndexOutOfBoundsException::<init> (not loaded)   not inlineable
                                  @ 21   java.lang.StringUTF16::charAt (11 bytes)
                                    @ 2   java.lang.StringUTF16::checkIndex (9 bytes)
                                      @ 2   java.lang.StringUTF16::length (5 bytes)
                                      @ 5   java.lang.String::checkIndex (46 bytes)   callee is too large
                                    @ 7   java.lang.StringUTF16::getChar (60 bytes)   intrinsic
        157   34       3       java.util.ImmutableCollections$SetN::<init> (90 bytes)
                                  @ 1   java.util.ImmutableCollections$AbstractImmutableSet::<init> (5 bytes)
                                    @ 1   java.util.AbstractSet::<init> (5 bytes)
                                      @ 1   java.util.AbstractCollection::<init> (5 bytes)
                                        @ 1   java.lang.Object::<init> (1 bytes)
                                  @ 35   java.util.ImmutableCollections$SetN::probe (60 bytes)   callee is too large
                                  @ 53   java.lang.StringBuilder::<init> (7 bytes)
                                    @ 3   java.lang.AbstractStringBuilder::<init> (39 bytes)   callee is too large
                                  @ 58   java.lang.StringBuilder::append (8 bytes)
                                    @ 2   java.lang.AbstractStringBuilder::append (45 bytes)   callee is too large
                                  @ 62   java.lang.StringBuilder::append (9 bytes)
                                    @ 2   java.lang.String::valueOf (14 bytes)
                                      @ 10   java.lang.Object::toString (36 bytes)   no static binding
                                    @ 5   java.lang.StringBuilder::append (8 bytes)
                                      @ 2   java.lang.AbstractStringBuilder::append (45 bytes)   callee is too large
                                  @ 65   java.lang.StringBuilder::toString (35 bytes)
                                    @ 1   java.lang.AbstractStringBuilder::isLatin1 (19 bytes)
                                    @ 16   java.lang.StringLatin1::newString (17 bytes)
                                      @ 9   java.util.Arrays::copyOfRange (63 bytes)   callee is too large
                                      @ 13   java.lang.String::<init> (15 bytes)
                                        @ 1   java.lang.Object::<init> (1 bytes)
                                    @ 31   java.lang.StringUTF16::newString (50 bytes)   callee is too large
                                  @ 68   java.lang.IllegalArgumentException::<init> (6 bytes)   don't inline Throwable constructors
        160   35       3       java.net.URI::hash (33 bytes)
                                  @ 9   java.lang.String::indexOf (7 bytes)
                                    @ 3   java.lang.String::indexOf (29 bytes)
                                      @ 1   java.lang.String::isLatin1 (19 bytes)
                                      @ 13   java.lang.StringLatin1::indexOf (61 bytes)   callee is too large
                                      @ 25   java.lang.StringUTF16::indexOf (43 bytes)   callee is too large
                                  @ 20   java.lang.String::hashCode (49 bytes)   callee is too large
                                  @ 29   java.net.URI::normalizedHash (84 bytes)   callee is too large
        161   33       3       java.lang.StringLatin1::charAt (28 bytes)
                                  @ 15  java/lang/StringIndexOutOfBoundsException::<init> (not loaded)   not inlineable
        167   36       3       java.lang.StringUTF16::getChar (60 bytes)
        167   37       3       java.lang.String::length (11 bytes)
                                  @ 6   java.lang.String::coder (15 bytes)
        171   38       3       java.util.concurrent.ConcurrentHashMap::spread (10 bytes)
        171   39       3       java.util.ImmutableCollections$SetN$1::hasNext (47 bytes)
        172   40       3       java.util.ImmutableCollections$SetN$1::next (35 bytes)
                                  @ 1   java.util.ImmutableCollections$SetN$1::hasNext (47 bytes)   callee is too large
                                  @ 11  java/util/NoSuchElementException::<init> (not loaded)   not inlineable
        174   41       3       java.util.HashMap::hash (20 bytes)
                                  @ 9   java.lang.Object::hashCode (0 bytes)   no static binding
        179   42       3       java.util.ImmutableCollections$MapN::probe (64 bytes)
                                  @ 1   java.lang.Object::hashCode (0 bytes)   no static binding
                                  @ 15   java.lang.Math::floorMod (10 bytes)
                                    @ 3   java.lang.Math::floorDiv (22 bytes)
                                  @ 39   java.lang.Object::equals (11 bytes)   no static binding
        180   46       3       java.util.HashMap::putVal (300 bytes)
                                  @ 20   java.util.HashMap::resize (356 bytes)   callee is too large
                                  @ 56   java.util.HashMap::newNode (13 bytes)   no static binding
                                  @ 91   java.lang.Object::equals (11 bytes)   no static binding
                                  @ 123   java.util.HashMap$TreeNode::putTreeVal (314 bytes)   not inlineable
                                  @ 152   java.util.HashMap::newNode (13 bytes)   no static binding
                                  @ 169   java.util.HashMap::treeifyBin (110 bytes)   callee is too large
                                  @ 203   java.lang.Object::equals (11 bytes)   no static binding
                                  @ 253   java.util.HashMap::afterNodeAccess (1 bytes)   no static binding
                                  @ 288   java.util.HashMap::resize (356 bytes)   callee is too large
                                  @ 295   java.util.HashMap::afterNodeInsertion (1 bytes)   no static binding
        184   51       3       java.util.HashMap::getNode (148 bytes)
                                  @ 59   java.lang.Object::equals (11 bytes)   no static binding
                                  @ 94   java.util.HashMap$TreeNode::getTreeNode (22 bytes)   not inlineable
                                  @ 126   java.lang.Object::equals (11 bytes)   no static binding
        184   52       4       java.lang.String::hashCode (49 bytes)
        185   45       3       java.util.HashMap::put (13 bytes)
                                  @ 2   java.util.HashMap::hash (20 bytes)
                                    @ 9   java.lang.Object::hashCode (0 bytes)   no static binding
                                  @ 9   java.util.HashMap::putVal (300 bytes)   callee is too large
        186   47       3       java.util.HashMap$Node::<init> (26 bytes)
                                  @ 1   java.lang.Object::<init> (1 bytes)
        186   44       1       java.lang.module.ModuleDescriptor$Requires::name (5 bytes)
        186   53       3       java.lang.module.ModuleDescriptor::hashCode (170 bytes)
                                  @ 13   java.lang.String::hashCode (49 bytes)   callee is too large
                                  @ 25   java.util.Objects::hashCode (13 bytes)
                                    @ 5   java.lang.Object::hashCode (0 bytes)   no static binding
                                  @ 38   java.util.Set::hashCode (0 bytes)   no static binding
                                  @ 53   java.util.Objects::hashCode (13 bytes)
                                    @ 5   java.lang.Object::hashCode (0 bytes)   no static binding
                                  @ 66   java.util.Set::hashCode (0 bytes)   no static binding
                                  @ 81   java.util.Set::hashCode (0 bytes)   no static binding
                                  @ 96   java.util.Set::hashCode (0 bytes)   no static binding
                                  @ 111   java.util.Set::hashCode (0 bytes)   no static binding
                                  @ 126   java.util.Objects::hashCode (13 bytes)
                                    @ 5   java.lang.module.ModuleDescriptor$Version::hashCode (8 bytes)
                                      @ 4   java.lang.String::hashCode (49 bytes)   callee is too large
                                  @ 139   java.util.Objects::hashCode (13 bytes)
                                    @ 5   java.lang.String::hashCode (49 bytes)   callee is too large
                                  @ 152   java.util.Objects::hashCode (13 bytes)
                                    @ 5   java.lang.String::hashCode (49 bytes)   callee is too large
        189   58       3       java.util.HashMap::newNode (13 bytes)
                                  @ 9   java.util.HashMap$Node::<init> (26 bytes)
                                    @ 1   java.lang.Object::<init> (1 bytes)
        190   59       3       java.util.HashMap::afterNodeInsertion (1 bytes)
        190   57       3       java.util.HashMap::get (23 bytes)
                                  @ 2   java.util.HashMap::hash (20 bytes)
                                    @ 9   java.lang.Object::hashCode (0 bytes)   no static binding
                                  @ 6   java.util.HashMap::getNode (148 bytes)   callee is too large
        191   64     n 0       java.lang.Object::hashCode (native)   
        191   63       3       java.util.HashMap$HashIterator::nextNode (100 bytes)
                                  @ 23  java/util/ConcurrentModificationException::<init> (not loaded)   not inlineable
                                  @ 35  java/util/NoSuchElementException::<init> (not loaded)   not inlineable
        192   60       3       java.util.HashMap$HashIterator::hasNext (13 bytes)
        192   62       3       jdk.internal.module.ModuleReferenceImpl::hashCode (56 bytes)
                                  @ 10   java.lang.module.ModuleReference::descriptor (5 bytes)
                                  @ 13   java.lang.module.ModuleDescriptor::hashCode (170 bytes)   callee is too large
                                  @ 25   java.util.Objects::hashCode (13 bytes)
                                    @ 5   java.net.URI::hashCode (123 bytes)   callee is too large
                                      198    7       3       java.lang.String::hashCode (49 bytes)   made not entrant
    @ 38   java.util.Objects::hashCode (13 bytes)
                                  @ 19   java.lang.String::isLatin1 (19 bytes)   inline (hot)
                                  @ 29   java.lang.StringLatin1::hashCode (42 bytes)   inline (hot)
                                  @ 39   java.lang.StringUTF16::hashCode (33 bytes)   executed < MinInliningThreshold times
                                    @ 5   java.lang.Object::hashCode (0 bytes)   native method
        199   65       3       java.lang.module.ResolvedModule::hashCode (16 bytes)
                                  @ 4   java.lang.Object::hashCode (0 bytes)   native method
                                  @ 11   java.lang.Object::hashCode (0 bytes)   no static binding
        200   54       3       java.util.HashSet::add (20 bytes)
                                  @ 8   java.util.HashMap::put (13 bytes)
                                    @ 2   java.util.HashMap::hash (20 bytes)
                                      @ 9   java.lang.Object::hashCode (0 bytes)   no static binding
                                    @ 9   java.util.HashMap::putVal (300 bytes)   callee is too large
        201   73       1       java.util.HashMap::afterNodeInsertion (1 bytes)
        201   59       3       java.util.HashMap::afterNodeInsertion (1 bytes)   made not entrant
        201   66       3       java.util.HashMap$KeyIterator::next (8 bytes)
                                  @ 1   java.util.HashMap$HashIterator::nextNode (100 bytes)   callee is too large
        201   56       3       java.util.HashMap::containsKey (18 bytes)
                                  @ 2   java.util.HashMap::hash (20 bytes)
                                    @ 9   java.lang.Object::hashCode (0 bytes)   no static binding
                                  @ 6   java.util.HashMap::getNode (148 bytes)   callee is too large
        202   43       1       java.lang.module.ModuleDescriptor$Requires::modifiers (5 bytes)
        202   74       3       java.lang.module.ModuleDescriptor$Exports::isQualified (18 bytes)
                202   77       4       java.util.ImmutableCollections$SetN$1::hasNext (47 bytes)
                          @ 4   java.util.Set::isEmpty (0 bytes)   no static binding
        203   75       3       java.util.AbstractCollection::isEmpty (13 bytes)
                                  @ 1   java.util.AbstractCollection::size (0 bytes)   no static binding
        203   67       3       java.util.HashMap::keySet (25 bytes)
                                  @ 14   java.util.HashMap$KeySet::<init> (10 bytes)
                                    @ 6   java.util.AbstractSet::<init> (5 bytes)
                                      @ 1   java.util.AbstractCollection::<init> (5 bytes)
                                        @ 1   java.lang.Object::<init> (1 bytes)
        204   78       3       java.util.HashMap::putIfAbsent (13 bytes)
                                  @ 2   java.util.HashMap::hash (20 bytes)
                                    @ 9   java.lang.Object::hashCode (0 bytes)   no static binding
                                  @ 9   java.util.HashMap::putVal (300 bytes)   callee is too large
        205   68       3       java.util.HashMap$KeySet::iterator (12 bytes)
                                  @ 8   java.util.HashMap$KeyIterator::<init> (11 bytes)
                                    @ 7   java.util.HashMap$HashIterator::<init> (79 bytes)   callee is too large
        205   79       3       java.util.ImmutableCollections$Set1::contains (9 bytes)
                                  @ 5   java.lang.Object::equals (11 bytes)   no static binding
        206   69       1       java.util.Collections$EmptySet::isEmpty (2 bytes)
        206   50       1       java.util.ImmutableCollections$Set1::size (2 bytes)
        206   49       1       java.util.Collections$1::hasNext (5 bytes)
        206   39       3       java.util.ImmutableCollections$SetN$1::hasNext (47 bytes)   made not entrant
        206   71       1       java.lang.module.ModuleDescriptor$Exports::targets (5 bytes)
        206   70       1       java.lang.module.ModuleDescriptor$Exports::source (5 bytes)
        207   55       1       java.lang.module.ModuleDescriptor::requires (5 bytes)
        207   72       1       java.util.ImmutableCollections$SetN::size (5 bytes)
        207   61       1       java.lang.module.ModuleDescriptor::isAutomatic (5 bytes)
        207   76       1       java.util.ImmutableCollections$Set2::size (2 bytes)
        207   82       3       java.util.HashMap::resize (356 bytes)
                                  @ 217   java.util.HashMap$TreeNode::split (218 bytes)   not inlineable
        208   84       4       java.util.ImmutableCollections$SetN$1::next (35 bytes)
        210   83       3       java.util.ImmutableCollections$SetN::contains (14 bytes)
                                  @ 2   java.util.ImmutableCollections$SetN::probe (60 bytes)   callee is too large
        210   81       1       java.lang.module.ModuleDescriptor::exports (5 bytes)
        213   86       4       java.lang.module.ModuleDescriptor$Exports::isQualified (18 bytes)
        213   89       3       java.util.ImmutableCollections$Set2::contains (28 bytes)
                                  @ 5   java.lang.Object::equals (11 bytes)   no static binding
                                  @ 16   java.lang.Object::equals (11 bytes)   no static binding
        214   40       3       java.util.ImmutableCollections$SetN$1::next (35 bytes)   made not entrant
                                  @ 1   java.util.ImmutableCollections$SetN$1::hasNext (47 bytes)   inline (hot)
        214   85       1       java.lang.module.ResolvedModule::reference (5 bytes)
        214   88       4       java.lang.String::equals (65 bytes)
        214   87       3       java.util.HashSet::iterator (13 bytes)
        214   74       3       java.lang.module.ModuleDescriptor$Exports::isQualified (18 bytes)   made not entrant
                                  @ 4   java.util.Set::isEmpty (0 bytes)   virtual call
                                  @ 4   java.util.HashMap::keySet (25 bytes)   no static binding
                                  @ 7   java.util.Set::iterator (0 bytes)   no static binding
        215   48       1       java.lang.module.ModuleDescriptor::provides (5 bytes)
        215   80       1       java.lang.module.ModuleDescriptor::uses (5 bytes)
        216   90       1       java.lang.module.ModuleDescriptor$Provides::service (5 bytes)
        216   91       4       java.util.HashMap::putVal (300 bytes)
        218   13       3       java.lang.String::equals (65 bytes)   made not entrant
                                  @ 20   java.lang.String::coder (15 bytes)   inline (hot)
                                  @ 24   java.lang.String::coder (15 bytes)   inline (hot)
                                  @ 31   java.lang.String::isLatin1 (19 bytes)   inline (hot)
                                  @ 45   java.lang.StringLatin1::equals (36 bytes)   (intrinsic)
        219   92       3       java.lang.String::<init> (15 bytes)
                                  @ 1   java.lang.Object::<init> (1 bytes)
        221   93       3       java.util.HashMap$HashIterator::<init> (79 bytes)
                                  @ 6   java.lang.Object::<init> (1 bytes)
        221   94       4       java.util.HashMap::newNode (13 bytes)
        222   95       3       java.lang.StringLatin1::lastIndexOf (125 bytes)
        223   96       3       java.util.AbstractMap::<init> (5 bytes)
                                  @ 1   java.lang.Object::<init> (1 bytes)
        225   97       3       java.lang.module.ResolvedModule::descriptor (8 bytes)
                                  @ 1   java.lang.module.ResolvedModule::reference (5 bytes)
                                  @ 4   java.lang.module.ModuleReference::descriptor (5 bytes)
        227   99       3       java.util.ImmutableCollections$SetN::iterator (9 bytes)
                                  @ 5   java.util.ImmutableCollections$SetN$1::<init> (15 bytes)
                                    @ 6   java.lang.Object::<init> (1 bytes)
        228  100       3       java.util.HashMap::<init> (11 bytes)
                                  @ 1   java.util.AbstractMap::<init> (5 bytes)
                                    @ 1   java.lang.Object::<init> (1 bytes)
        229   58       3       java.util.HashMap::newNode (13 bytes)   made not entrant
                                  @ 9   java.util.HashMap$Node::<init> (26 bytes)   inline (hot)
                                    @ 1   java.lang.Object::<init> (1 bytes)   inline (hot)
        229   98       4       java.util.HashMap::putIfAbsent (13 bytes)
        231  102       1       java.util.KeyValueHolder::getKey (5 bytes)
        232  103       1       java.util.KeyValueHolder::getValue (5 bytes)
        233  104       3       java.util.HashSet::contains (9 bytes)
                                  @ 5   java.util.HashMap::containsKey (18 bytes)
                                    @ 2   java.util.HashMap::hash (20 bytes)
                                      @ 9   java.lang.Object::hashCode (0 bytes)   no static binding
                                    @ 6   java.util.HashMap::getNode (148 bytes)   callee is too large
        235  105       3       java.util.concurrent.ConcurrentHashMap::addCount (289 bytes)
                                  @ 31   jdk.internal.misc.Unsafe::compareAndSetLong (0 bytes)   intrinsic
                                  @ 58  java/util/concurrent/ThreadLocalRandom::getProbe (not loaded)   not inlineable
                                  @ 91   jdk.internal.misc.Unsafe::compareAndSetLong (0 bytes)   intrinsic
                                  @ 115   java.util.concurrent.ConcurrentHashMap::sumCount (48 bytes)   callee is too large
                                  @ 161   java.util.concurrent.ConcurrentHashMap::resizeStamp (8 bytes)
                                    @ 1   java.lang.Integer::numberOfLeadingZeros (76 bytes)   callee is too large
                                  @ 233   jdk.internal.misc.Unsafe::compareAndSetInt (0 bytes)   intrinsic
                   !m             @ 244   java.util.concurrent.ConcurrentHashMap::transfer (828 bytes)   callee is too large
                                  @ 266   jdk.internal.misc.Unsafe::compareAndSetInt (0 bytes)   intrinsic
                   !m             @ 276   java.util.concurrent.ConcurrentHashMap::transfer (828 bytes)   callee is too large
                                  @ 280   java.util.concurrent.ConcurrentHashMap::sumCount (48 bytes)   callee is too large
                   !              @ 104   java.util.concurrent.ConcurrentHashMap::fullAddCount (487 bytes)   callee is too large
        239  106     n 0       jdk.internal.misc.Unsafe::compareAndSetLong (native)   
        239  107   !   3       java.util.concurrent.ConcurrentHashMap::putVal (432 bytes)
                                  @ 17   java.lang.Object::hashCode (0 bytes)   no static binding
                                  @ 20   java.util.concurrent.ConcurrentHashMap::spread (10 bytes)
                                  @ 69   java.util.concurrent.ConcurrentHashMap::tabAt (22 bytes)
                                    @ 15   jdk.internal.misc.Unsafe::getObjectAcquire (7 bytes)
                                      @ 3   jdk.internal.misc.Unsafe::getObjectVolatile (0 bytes)   intrinsic
                                  @ 91   java.util.concurrent.ConcurrentHashMap$Node::<init> (20 bytes)
                                    @ 1   java.lang.Object::<init> (1 bytes)
                                  @ 94   java.util.concurrent.ConcurrentHashMap::casTabAt (21 bytes)
                                    @ 17   jdk.internal.misc.Unsafe::compareAndSetObject (0 bytes)   intrinsic
                                  @ 120   java.util.concurrent.ConcurrentHashMap::helpTransfer (130 bytes)   callee is too large
                                  @ 159   java.lang.Object::equals (11 bytes)   no static binding
                                  @ 192   java.util.concurrent.ConcurrentHashMap::tabAt (22 bytes)
                                    @ 15   jdk.internal.misc.Unsafe::getObjectAcquire (7 bytes)
                                      @ 3   jdk.internal.misc.Unsafe::getObjectVolatile (0 bytes)   intrinsic
                                  @ 242   java.lang.Object::equals (11 bytes)   no static binding
                                  @ 293   java.util.concurrent.ConcurrentHashMap$Node::<init> (20 bytes)
                                    @ 1   java.lang.Object::<init> (1 bytes)
                                  @ 331  java/util/concurrent/ConcurrentHashMap$TreeBin::putTreeVal (not loaded)   not inlineable
                                  @ 374  java/lang/IllegalStateException::<init> (not loaded)   not inlineable
                   !m             @ 409   java.util.concurrent.ConcurrentHashMap::treeifyBin (164 bytes)   callee is too large
                                  @ 427   java.util.concurrent.ConcurrentHashMap::addCount (289 bytes)   callee is too large
                   !              @ 49   java.util.concurrent.ConcurrentHashMap::initTable (112 bytes)   callee is too large
                                  @ 12   java.lang.NullPointerException::<init> (5 bytes)   don't inline Throwable constructors
        277   46       3       java.util.HashMap::putVal (300 bytes)   made not entrant
                                  @ 20   java.util.HashMap::resize (356 bytes)   hot method too big
                                  @ 56   java.util.HashMap::newNode (13 bytes)   inline (hot)
                                  @ 56   java.util.LinkedHashMap::newNode (23 bytes)   executed < MinInliningThreshold times
                                   \-> TypeProfile (3754/3832 counts) = java/util/HashMap
                                    @ 9   java.util.HashMap$Node::<init> (26 bytes)   inline (hot)
                                      @ 1   java.lang.Object::<init> (1 bytes)   inline (hot)
                                  @ 203   java.lang.Object::equals (11 bytes)   virtual call
                                  @ 152   java.util.HashMap::newNode (13 bytes)   inline (hot)
                                  @ 152   java.util.LinkedHashMap::newNode (23 bytes)   executed < MinInliningThreshold times
                                   \-> TypeProfile (2308/2310 counts) = java/util/HashMap
                                    @ 9   java.util.HashMap$Node::<init> (26 bytes)   inline (hot)
                                      @ 1   java.lang.Object::<init> (1 bytes)   inline (hot)
                                  @ 253   java.util.HashMap::afterNodeAccess (1 bytes)   inline (hot)
                                   \-> TypeProfile (1/1 counts) = java/util/HashMap
                                  @ 288   java.util.HashMap::resize (356 bytes)   hot method too big
                                  @ 295   java.util.HashMap::afterNodeInsertion (1 bytes)   inline (hot)
                                  @ 295   java.util.LinkedHashMap::afterNodeInsertion (40 bytes)   executed < MinInliningThreshold times
                                   \-> TypeProfile (6062/6142 counts) = java/util/HashMap
        277  101       4       java.util.AbstractCollection::isEmpty (13 bytes)
        278   75       3       java.util.AbstractCollection::isEmpty (13 bytes)   made not entrant
                                  @ 1   java.util.AbstractCollection::size (0 bytes)   virtual call
        288   78       3       java.util.HashMap::putIfAbsent (13 bytes)   made not entrant
                                  @ 2   java.util.HashMap::hash (20 bytes)   inline (hot)
                                    @ 9   java.lang.Object::hashCode (0 bytes)   (intrinsic, virtual)
                                  @ 9   java.util.HashMap::putVal (300 bytes)   inline (hot)
                                    @ 20   java.util.HashMap::resize (356 bytes)   hot method too big
                                    @ 56   java.util.HashMap::newNode (13 bytes)   inline (hot)
                                    @ 56   java.util.LinkedHashMap::newNode (23 bytes)   executed < MinInliningThreshold times
                                     \-> TypeProfile (5016/5094 counts) = java/util/HashMap
                                      @ 9   java.util.HashMap$Node::<init> (26 bytes)   inline (hot)
                                        @ 1   java.lang.Object::<init> (1 bytes)   inline (hot)
                                    @ 203   java.lang.Object::equals (11 bytes)   virtual call
                                    @ 152   java.util.HashMap::newNode (13 bytes)   inline (hot)
                                    @ 152   java.util.LinkedHashMap::newNode (23 bytes)   executed < MinInliningThreshold times
                                     \-> TypeProfile (3131/3133 counts) = java/util/HashMap
                                      @ 9   java.util.HashMap$Node::<init> (26 bytes)   inline (hot)
                                        @ 1   java.lang.Object::<init> (1 bytes)   inline (hot)
                                    @ 253   java.util.HashMap::afterNodeAccess (1 bytes)   inline (hot)
                                     \-> TypeProfile (1/1 counts) = java/util/HashMap
                                    @ 288   java.util.HashMap::resize (356 bytes)   hot method too big
                                    @ 295   java.util.HashMap::afterNodeInsertion (1 bytes)   inline (hot)
                                    @ 295   java.util.LinkedHashMap::afterNodeInsertion (40 bytes)   executed < MinInliningThreshold times
                                     \-> TypeProfile (8147/8227 counts) = java/util/HashMap
        292  108     n 0       jdk.internal.misc.Unsafe::compareAndSetObject (native)   
        292  109       3       java.util.concurrent.ConcurrentHashMap::putIfAbsent (8 bytes)
                   !m             @ 4   java.util.concurrent.ConcurrentHashMap::putVal (432 bytes)   callee is too large
        293  110       3       java.util.ImmutableCollections$Set2$1::next (49 bytes)
                                  @ 45  java/util/NoSuchElementException::<init> (not loaded)   not inlineable
        294  111       3       java.util.ImmutableCollections$Set2$1::hasNext (14 bytes)
        294  112       3       java.lang.Math::min (11 bytes)
        295    1       3       java.util.concurrent.ConcurrentHashMap::tabAt (22 bytes)   made not entrant
        295  107   !   3       java.util.concurrent.ConcurrentHashMap::putVal (432 bytes)   made not entrant
        295  113       3       java.util.concurrent.ConcurrentHashMap::casTabAt (21 bytes)
                                  @ 17   jdk.internal.misc.Unsafe::compareAndSetObject (0 bytes)   intrinsic
        296  114       3       java.util.concurrent.ConcurrentHashMap::tabAt (22 bytes)
                                  @ 15   jdk.internal.misc.Unsafe::getObjectAcquire (7 bytes)
                                    @ 3   jdk.internal.misc.Unsafe::getObjectVolatile (0 bytes)   intrinsic
        297  115       3       java.util.concurrent.ConcurrentHashMap$Node::<init> (20 bytes)
                                  @ 1   java.lang.Object::<init> (1 bytes)
        298  116   !   3       java.util.concurrent.ConcurrentHashMap::putVal (432 bytes)
                                  @ 17   java.lang.Object::hashCode (0 bytes)   no static binding
                                  @ 20   java.util.concurrent.ConcurrentHashMap::spread (10 bytes)
                                  @ 69   java.util.concurrent.ConcurrentHashMap::tabAt (22 bytes)
                                    @ 15   jdk.internal.misc.Unsafe::getObjectAcquire (7 bytes)
                                      @ 3   jdk.internal.misc.Unsafe::getObjectVolatile (0 bytes)   intrinsic
                                  @ 91   java.util.concurrent.ConcurrentHashMap$Node::<init> (20 bytes)
                                    @ 1   java.lang.Object::<init> (1 bytes)
                                  @ 94   java.util.concurrent.ConcurrentHashMap::casTabAt (21 bytes)
                                    @ 17   jdk.internal.misc.Unsafe::compareAndSetObject (0 bytes)   intrinsic
                                  @ 120   java.util.concurrent.ConcurrentHashMap::helpTransfer (130 bytes)   callee is too large
                                  @ 159   java.lang.Object::equals (11 bytes)   no static binding
                                  @ 192   java.util.concurrent.ConcurrentHashMap::tabAt (22 bytes)
                                    @ 15   jdk.internal.misc.Unsafe::getObjectAcquire (7 bytes)
                                      @ 3   jdk.internal.misc.Unsafe::getObjectVolatile (0 bytes)   intrinsic
                                  @ 242   java.lang.Object::equals (11 bytes)   no static binding
                                  @ 293   java.util.concurrent.ConcurrentHashMap$Node::<init> (20 bytes)
                                    @ 1   java.lang.Object::<init> (1 bytes)
                                  @ 331  java/util/concurrent/ConcurrentHashMap$TreeBin::putTreeVal (not loaded)   not inlineable
                                  @ 374  java/lang/IllegalStateException::<init> (not loaded)   not inlineable
                   !m             @ 409   java.util.concurrent.ConcurrentHashMap::treeifyBin (164 bytes)   callee is too large
                                  @ 427   java.util.concurrent.ConcurrentHashMap::addCount (289 bytes)   callee is too large
                   !              @ 49   java.util.concurrent.ConcurrentHashMap::initTable (112 bytes)   callee is too large
                                  @ 12   java.lang.NullPointerException::<init> (5 bytes)   don't inline Throwable constructors
        329  117       1       java.lang.module.ModuleDescriptor::packages (5 bytes)
        329  118       3       java.lang.StringLatin1::canEncode (13 bytes)
        330  119       3       java.util.Optional::ofNullable (15 bytes)
                                  @ 4   java.util.Optional::empty (6 bytes)
                                  @ 11   java.util.Optional::of (9 bytes)
                                    @ 5   java.util.Optional::<init> (13 bytes)
                                      @ 1   java.lang.Object::<init> (1 bytes)
                                      @ 6   java.util.Objects::requireNonNull (14 bytes)
                                        @ 8   java.lang.NullPointerException::<init> (5 bytes)   don't inline Throwable constructors
        332  120       3       java.lang.String::indexOf (7 bytes)
                                  @ 3   java.lang.String::indexOf (29 bytes)
                                    @ 1   java.lang.String::isLatin1 (19 bytes)
                                    @ 13   java.lang.StringLatin1::indexOf (61 bytes)   callee is too large
                                    @ 25   java.lang.StringUTF16::indexOf (43 bytes)   callee is too large
        333  121       3       java.lang.String::indexOf (29 bytes)
                                  @ 1   java.lang.String::isLatin1 (19 bytes)
                                  @ 13   java.lang.StringLatin1::indexOf (61 bytes)   callee is too large
                                  @ 25   java.lang.StringUTF16::indexOf (43 bytes)   callee is too large
        333  122       3       java.lang.StringLatin1::indexOf (61 bytes)
        333   91       4       java.util.HashMap::putVal (300 bytes)   made not entrant
                                  @ 1   java.lang.StringLatin1::canEncode (13 bytes)
        334  124       3       java.util.HashMap::putVal (300 bytes)
                                  @ 20   java.util.HashMap::resize (356 bytes)   callee is too large
                                  @ 56   java.util.HashMap::newNode (13 bytes)   no static binding
                                  @ 91   java.lang.Object::equals (11 bytes)   no static binding
                                  @ 123   java.util.HashMap$TreeNode::putTreeVal (314 bytes)   not inlineable
                                  @ 152   java.util.HashMap::newNode (13 bytes)   no static binding
                                  @ 169   java.util.HashMap::treeifyBin (110 bytes)   callee is too large
                                  @ 203   java.lang.Object::equals (11 bytes)   no static binding
                                  @ 253   java.util.HashMap::afterNodeAccess (1 bytes)   no static binding
                                  @ 288   java.util.HashMap::resize (356 bytes)   callee is too large
                                  @ 295   java.util.HashMap::afterNodeInsertion (1 bytes)   no static binding
        337  123       3       java.lang.module.ResolvedModule::name (11 bytes)
                                  @ 1   java.lang.module.ResolvedModule::reference (5 bytes)
                                  @ 4   java.lang.module.ModuleReference::descriptor (5 bytes)
                                  @ 7   java.lang.module.ModuleDescriptor::name (5 bytes)
        339  125       1       java.lang.module.ModuleDescriptor$Version::toString (5 bytes)
        340  126       3       java.util.Optional::orElse (16 bytes)
        343  127       3       java.util.Arrays::copyOfRange (63 bytes)
                                  @ 16   java.lang.StringBuilder::<init> (7 bytes)
                                    @ 3   java.lang.AbstractStringBuilder::<init> (39 bytes)   callee is too large
                                  @ 20   java.lang.StringBuilder::append (8 bytes)
                                    @ 2   java.lang.AbstractStringBuilder::append (55 bytes)   callee is too large
                                  @ 25   java.lang.StringBuilder::append (8 bytes)
                                    @ 2   java.lang.AbstractStringBuilder::append (45 bytes)   callee is too large
                                  @ 29   java.lang.StringBuilder::append (8 bytes)
                                    @ 2   java.lang.AbstractStringBuilder::append (55 bytes)   callee is too large
                                  @ 32   java.lang.StringBuilder::toString (35 bytes)
                                    @ 1   java.lang.AbstractStringBuilder::isLatin1 (19 bytes)
                                    @ 16   java.lang.StringLatin1::newString (17 bytes)
                                      @ 9   java.util.Arrays::copyOfRange (63 bytes)   callee is too large
                                      @ 13   java.lang.String::<init> (15 bytes)
                                        @ 1   java.lang.Object::<init> (1 bytes)
                                    @ 31   java.lang.StringUTF16::newString (50 bytes)   callee is too large
                                  @ 35   java.lang.IllegalArgumentException::<init> (6 bytes)   don't inline Throwable constructors
                                  @ 54   java.lang.Math::min (11 bytes)
                                  @ 57   java.lang.System::arraycopy (0 bytes)   intrinsic
        349  128       3       java.lang.StringLatin1::newString (17 bytes)
                                  @ 9   java.util.Arrays::copyOfRange (63 bytes)   callee is too large
                                  @ 13   java.lang.String::<init> (15 bytes)
                                    @ 1   java.lang.Object::<init> (1 bytes)
        352  129       3       java.util.ImmutableCollections$Set1::iterator (8 bytes)
                                  @ 4   java.util.Collections::singletonIterator (9 bytes)
                                    @ 5   java.util.Collections$1::<init> (15 bytes)
                                      @ 6   java.lang.Object::<init> (1 bytes)
        364  130       3       java.util.Collections$1::next (25 bytes)
                                  @ 21  java/util/NoSuchElementException::<init> (not loaded)   not inlineable
        365  131       3       java.lang.AbstractStringBuilder::ensureCapacityInternal (39 bytes)
                                  @ 24   java.lang.AbstractStringBuilder::newCapacity (55 bytes)   callee is too large
                                  @ 32   java.util.Arrays::copyOf (19 bytes)
                                    @ 11   java.lang.Math::min (11 bytes)
                                    @ 14   java.lang.System::arraycopy (0 bytes)   intrinsic
        400  132       3       java.net.URI::isOpaque (13 bytes)
        410  101       4       java.util.AbstractCollection::isEmpty (13 bytes)   made not entrant
        425  133       3       java.util.AbstractCollection::isEmpty (13 bytes)
                                  @ 1   java.util.AbstractCollection::size (0 bytes)   no static binding
        425  134       3       java.util.HashSet::<init> (16 bytes)
                                  @ 1   java.util.AbstractSet::<init> (5 bytes)
                                    @ 1   java.util.AbstractCollection::<init> (5 bytes)
                                      @ 1   java.lang.Object::<init> (1 bytes)
                                  @ 9   java.util.HashMap::<init> (11 bytes)
                                    @ 1   java.util.AbstractMap::<init> (5 bytes)
                                      @ 1   java.lang.Object::<init> (1 bytes)
        426  135       1       java.util.ImmutableCollections$Set0::size (2 bytes)
        427  136     n 0       java.lang.Module::addExports0 (native)   (static)
        427  137       1       java.lang.module.ResolvedModule::configuration (5 bytes)
        427  138       3       java.util.Collections$UnmodifiableCollection$1::hasNext (10 bytes)
                                  @ 4   java.util.Iterator::hasNext (0 bytes)   no static binding
        428  140       3       java.util.Collections$UnmodifiableCollection$1::next (10 bytes)
                                  @ 4   java.util.Iterator::next (0 bytes)   no static binding
        428  139       1       java.lang.module.ModuleDescriptor::isOpen (5 bytes)
        429  141       1       java.util.Collections$EmptyIterator::hasNext (2 bytes)
        429  142     n 0       java.lang.Module::addReads0 (native)   (static)
        429  143       1       java.util.Collections$EmptyMap::get (2 bytes)
        430  144       3       java.util.HashSet::isEmpty (8 bytes)
                                  @ 4   java.util.HashMap::isEmpty (13 bytes)
        430  145     n 0       java.lang.Module::addExportsToAll0 (native)   (static)
        434  146       3       java.util.concurrent.ConcurrentHashMap::setTabAt (20 bytes)
                                  @ 16   jdk.internal.misc.Unsafe::putObjectRelease (9 bytes)
                                    @ 5   jdk.internal.misc.Unsafe::putObjectVolatile (0 bytes)   intrinsic
        434  147       3       jdk.internal.misc.Unsafe::putObjectRelease (9 bytes)
                                  @ 5   jdk.internal.misc.Unsafe::putObjectVolatile (0 bytes)   intrinsic
        435  148       1       jdk.internal.module.ModuleReferenceImpl::moduleResolution (5 bytes)
        435  149       4       java.util.ImmutableCollections$SetN::probe (60 bytes)
        435  150       3       java.util.Map::entry (10 bytes)
                                  @ 6   java.util.KeyValueHolder::<init> (21 bytes)
                                    @ 1   java.lang.Object::<init> (1 bytes)
                                    @ 6   java.util.Objects::requireNonNull (14 bytes)
                                      @ 8   java.lang.NullPointerException::<init> (5 bytes)   don't inline Throwable constructors
                                    @ 14   java.util.Objects::requireNonNull (14 bytes)
                                      @ 8   java.lang.NullPointerException::<init> (5 bytes)   don't inline Throwable constructors
        438  151       3       java.util.HashMap$ValueIterator::next (8 bytes)
                                  @ 1   java.util.HashMap$HashIterator::nextNode (100 bytes)   callee is too large
        439   98       4       java.util.HashMap::putIfAbsent (13 bytes)   made not entrant
        440  152       3       java.util.HashMap::putIfAbsent (13 bytes)
                                  @ 2   java.util.HashMap::hash (20 bytes)
                                    @ 9   java.lang.Object::hashCode (0 bytes)   no static binding
                                  @ 9   java.util.HashMap::putVal (300 bytes)   callee is too large
        441  153       1       java.lang.Module::getDescriptor (5 bytes)
        441  154       3       jdk.internal.module.ModuleBootstrap$2::hasNext (30 bytes)
                           442  156     n 0       java.lang.Module::addExportsToAllUnnamed0 (native)   (static)
               @ 4   java.util.Iterator::hasNext (0 bytes)   no static binding
                                  @ 16   java.util.Iterator::hasNext (0 bytes)   no static binding
        442  155       3       jdk.internal.module.ModuleBootstrap$2::next (52 bytes)
                                  @ 4   java.util.Iterator::hasNext (0 bytes)   no static binding
                                  @ 16   java.util.Iterator::next (0 bytes)   no static binding
                                  @ 26   java.util.Iterator::hasNext (0 bytes)   no static binding
                                  @ 38   java.util.Iterator::next (0 bytes)   no static binding
                                  @ 48  java/util/NoSuchElementException::<init> (not loaded)   not inlineable
        444  157       4       java.util.HashMap::resize (356 bytes)
        445   10       3       java.util.ImmutableCollections$SetN::probe (60 bytes)   made not entrant
                                  @ 1   java.lang.Object::hashCode (0 bytes)   (intrinsic, virtual)
                                  @ 13   java.lang.Math::floorMod (10 bytes)   inline (hot)
                                    @ 3   java.lang.Math::floorDiv (22 bytes)   inline (hot)
                                  @ 35   java.lang.Object::equals (11 bytes)   virtual call
        445  158       3       java.util.ImmutableCollections$Set0::instance (4 bytes)
        445  159       3       java.util.ImmutableCollections$MapN::get (21 bytes)
                                  @ 2   java.util.ImmutableCollections$MapN::probe (64 bytes)   callee is too large
        476   52       4       java.lang.String::hashCode (49 bytes)   made not entrant
        477  160       3       java.lang.String::hashCode (49 bytes)
                                  @ 19   java.lang.String::isLatin1 (19 bytes)
                                  @ 29   java.lang.StringLatin1::hashCode (42 bytes)   callee is too large
                                  @ 39   java.lang.StringUTF16::hashCode (33 bytes)
                                    @ 20   java.lang.StringUTF16::getChar (60 bytes)   intrinsic
        483  161       3       java.lang.StringUTF16::putChar (54 bytes)
        483  163       3       java.lang.AbstractStringBuilder::isLatin1 (19 bytes)
        483   88       4       java.lang.String::equals (65 bytes)   made not entrant
        484  164       3       java.lang.StringUTF16::checkIndex (9 bytes)
                                  @ 2   java.lang.StringUTF16::length (5 bytes)
                                  @ 5   java.lang.String::checkIndex (46 bytes)   callee is too large
        484  165       3       java.lang.String::checkIndex (46 bytes)
                                  @ 17   java.lang.StringBuilder::<init> (7 bytes)
                                    @ 3   java.lang.AbstractStringBuilder::<init> (39 bytes)   callee is too large
                                  @ 22   java.lang.StringBuilder::append (8 bytes)
                                    @ 2   java.lang.AbstractStringBuilder::append (45 bytes)   callee is too large
                                  @ 26   java.lang.StringBuilder::append (8 bytes)
                                    @ 2   java.lang.AbstractStringBuilder::append (55 bytes)   callee is too large
                                  @ 31   java.lang.StringBuilder::append (8 bytes)
                                    @ 2   java.lang.AbstractStringBuilder::append (45 bytes)   callee is too large
                                  @ 35   java.lang.StringBuilder::append (8 bytes)
                                    @ 2   java.lang.AbstractStringBuilder::append (55 bytes)   callee is too large
                                  @ 38   java.lang.StringBuilder::toString (35 bytes)
                                    @ 1   java.lang.AbstractStringBuilder::isLatin1 (19 bytes)
                                    @ 16   java.lang.StringLatin1::newString (17 bytes)
                                      @ 9   java.util.Arrays::copyOfRange (63 bytes)   callee is too large
                                      @ 13   java.lang.String::<init> (15 bytes)
                                        @ 1   java.lang.Object::<init> (1 bytes)
                                    @ 31   java.lang.StringUTF16::newString (50 bytes)   callee is too large
                                  @ 41  java/lang/StringIndexOutOfBoundsException::<init> (not loaded)   not inlineable
        487  162       3       java.lang.StringUTF16::length (5 bytes)
        489  166       3       java.lang.StringBuilder::append (8 bytes)
                                  @ 2   java.lang.AbstractStringBuilder::append (77 bytes)   callee is too large
        489  167       3       java.lang.AbstractStringBuilder::append (77 bytes)
                                  @ 7   java.lang.AbstractStringBuilder::ensureCapacityInternal (39 bytes)   callee is too large
                                  @ 11   java.lang.AbstractStringBuilder::isLatin1 (19 bytes)
                                  @ 18   java.lang.StringLatin1::canEncode (13 bytes)
                                  @ 46   java.lang.AbstractStringBuilder::isLatin1 (19 bytes)
                                  @ 53   java.lang.AbstractStringBuilder::inflate (42 bytes)   callee is too large
                                  @ 72   java.lang.StringUTF16::putCharSB (12 bytes)
                                    @ 2   java.lang.StringUTF16::checkIndex (9 bytes)
                                      @ 2   java.lang.StringUTF16::length (5 bytes)
                                      @ 5   java.lang.String::checkIndex (46 bytes)   callee is too large
                                    @ 8   java.lang.StringUTF16::putChar (54 bytes)   intrinsic
        491  168       3       java.io.WinNTFileSystem::isSlash (18 bytes)
        492  169       3       java.lang.String::checkBoundsBeginEnd (60 bytes)
                                  @ 22   java.lang.StringBuilder::<init> (7 bytes)
                                    @ 3   java.lang.AbstractStringBuilder::<init> (39 bytes)   callee is too large
                                  @ 27   java.lang.StringBuilder::append (8 bytes)
                                    @ 2   java.lang.AbstractStringBuilder::append (45 bytes)   callee is too large
                                  @ 31   java.lang.StringBuilder::append (8 bytes)
                                    @ 2   java.lang.AbstractStringBuilder::append (55 bytes)   callee is too large
                                  @ 36   java.lang.StringBuilder::append (8 bytes)
                                    @ 2   java.lang.AbstractStringBuilder::append (45 bytes)   callee is too large
                                  @ 40   java.lang.StringBuilder::append (8 bytes)
                                    @ 2   java.lang.AbstractStringBuilder::append (55 bytes)   callee is too large
                                  @ 45   java.lang.StringBuilder::append (8 bytes)
                                    @ 2   java.lang.AbstractStringBuilder::append (45 bytes)   callee is too large
                                  @ 49   java.lang.StringBuilder::append (8 bytes)
                                    @ 2   java.lang.AbstractStringBuilder::append (55 bytes)   callee is too large
                                  @ 52   java.lang.StringBuilder::toString (35 bytes)
                                    @ 1   java.lang.AbstractStringBuilder::isLatin1 (19 bytes)
                                    @ 16   java.lang.StringLatin1::newString (17 bytes)
                                      @ 9   java.util.Arrays::copyOfRange (63 bytes)   callee is too large
                                      @ 13   java.lang.String::<init> (15 bytes)
                                        @ 1   java.lang.Object::<init> (1 bytes)
                                    @ 31   java.lang.StringUTF16::newString (50 bytes)   callee is too large
                                  @ 55  java/lang/StringIndexOutOfBoundsException::<init> (not loaded)   not inlineable
        499  170       3       java.lang.String::equals (65 bytes)
        499  171       4       java.lang.String::coder (15 bytes)
                                  @ 20   java.lang.String::coder (15 bytes)
                                  @ 24   java.lang.String::coder (15 bytes)
                                  @ 31   java.lang.String::isLatin1 (19 bytes)
                                  @ 45   java.lang.StringLatin1::equals (36 bytes)   callee is too large
                                  @ 59   java.lang.StringUTF16::equals    499    5       3       java.lang.String::coder (15 bytes)   made not entrant
     (44 bytes)   callee is too large
        501   82       3       java.util.HashMap::resize (356 bytes)   made not entrant
        549  172       3       java.util.zip.ZipUtils::SH (21 bytes)
        550  173       3       java.lang.CharacterData::of (120 bytes)
        550  174       3       java.lang.CharacterDataLatin1::getProperties (11 bytes)
        551  175       3       java.lang.Character::toLowerCase (9 bytes)
                                  @ 1   java.lang.CharacterData::of (120 bytes)   callee is too large
                                  @ 5   java.lang.CharacterData::toLowerCase (0 bytes)   no static binding
        551  176       3       java.lang.CharacterDataLatin1::toLowerCase (39 bytes)
                                  @ 4   java.lang.CharacterDataLatin1::getProperties (11 bytes)
        597  177       3       java.util.jar.Attributes$Name::isValid (32 bytes)
                                  @ 1   java.util.jar.Attributes$Name::isAlpha (30 bytes)   not inlineable
                                  @ 8   java.util.jar.Attributes$Name::isDigit (18 bytes)   not inlineable
        597  178       3       java.util.jar.Attributes$Name::isAlpha (30 bytes)
        619  179       3       java.lang.AbstractStringBuilder::putStringAt (29 bytes)
                                  @ 1   java.lang.AbstractStringBuilder::getCoder (15 bytes)
                                  @ 5   java.lang.String::coder (15 bytes)
                                  @ 12   java.lang.AbstractStringBuilder::inflate (42 bytes)   callee is too large
                                  @ 25   java.lang.String::getBytes (44 bytes)   callee is too large
        626  180       3       sun.nio.fs.WindowsPathParser::isSlash (18 bytes)
        629  181       3       java.lang.StringBuilder::append (8 bytes)
                                  @ 2   java.lang.AbstractStringBuilder::append (45 bytes)   callee is too large
        629  182       3       java.lang.AbstractStringBuilder::append (45 bytes)
                                  @ 5   java.lang.AbstractStringBuilder::appendNull (83 bytes)   callee is too large
                                  @ 10   java.lang.String::length (11 bytes)
                                    @ 6   java.lang.String::coder (15 bytes)
                                  @ 21   java.lang.AbstractStringBuilder::ensureCapacityInternal (39 bytes)   callee is too large
                                  @ 30   java.lang.AbstractStringBuilder::putStringAt (29 bytes)
                                    @ 1   java.lang.AbstractStringBuilder::getCoder (15 bytes)
                                    @ 5   java.lang.String::coder (15 bytes)
                                    @ 12   java.lang.AbstractStringBuilder::inflate (42 bytes)   callee is too large
                                    @ 25   java.lang.String::getBytes (44 bytes)   callee is too large
        632  183       3       java.lang.StringLatin1::lastIndexOf (40 bytes)
                                  @ 1   java.lang.StringLatin1::canEncode (13 bytes)
                                  @ 14   java.lang.Math::min (11 bytes)
        634  184       3       java.lang.String::substring (58 bytes)
                                  @ 1   java.lang.String::length (11 bytes)
                                    @ 6   java.lang.String::coder (15 bytes)
                                  @ 8   java.lang.String::checkBoundsBeginEnd (60 bytes)   callee is too large
                                  @ 28   java.lang.String::isLatin1 (19 bytes)
                                  @ 41   java.lang.StringLatin1::newString (17 bytes)
                                    @ 9   java.util.Arrays::copyOfRange (63 bytes)   callee is too large
                                    @ 13   java.lang.String::<init> (15 bytes)
                                      @ 1   java.lang.Object::<init> (1 bytes)
                                  @ 54   java.lang.StringUTF16::newString (50 bytes)   callee is too large
        641  185       3       java.lang.System::getSecurityManager (4 bytes)
        650   23       1       java.lang.Object::<init> (1 bytes)   made not entrant
        655  186       1       java.lang.reflect.Method::getName (5 bytes)
        656  187       1       java.lang.Object::<init> (1 bytes)
        656  188       1       java.lang.Class::getClassLoader0 (5 bytes)
        669  189       3       java.util.Objects::checkIndex (7 bytes)
                                  @ 3   jdk.internal.util.Preconditions::checkIndex (18 bytes)
                                    @ 12   jdk.internal.util.Preconditions::outOfBoundsCheckIndex (25 bytes)
                                      @ 10   java.lang.Integer::valueOf (32 bytes)   callee is too large
                                      @ 17   java.lang.Integer::valueOf (32 bytes)   callee is too large
                                      @ 21   jdk.internal.util.Preconditions::outOfBounds (49 bytes)   callee is too large
        671  190       3       jdk.internal.util.Preconditions::checkIndex (18 bytes)
                                  @ 12   jdk.internal.util.Preconditions::outOfBoundsCheckIndex (25 bytes)
                                    @ 10   java.lang.Integer::valueOf (32 bytes)   callee is too large
                                    @ 17   java.lang.Integer::valueOf (32 bytes)   callee is too large
                                    @ 21   jdk.internal.util.Preconditions::outOfBounds (49 bytes)   callee is too large
        727  191       4       java.lang.String::charAt (25 bytes)
        727  192       3       sun.nio.fs.WindowsPathParser::isInvalidPathChar (22 bytes)
                                  @ 9   java.lang.String::indexOf (7 bytes)
                                    @ 3   java.lang.String::indexOf (29 bytes)
                                      @ 1   java.lang.String::isLatin1 (19 bytes)
                                      @ 13   java.lang.StringLatin1::indexOf (61 bytes)   callee is too large
        729  193       3       java.util.concurrent.ConcurrentHashMap::get (162 bytes)
                                  @ 1   java.lang.Object::hashCode (0 bytes)   no static binding
                                  @ 4   java.util.concurrent.ConcurrentHashMap::spread (10 bytes)
                                  @ 34   java.util.concurrent.ConcurrentHashMap::tabAt (22 bytes)
                                    @ 15   jdk.internal.misc.Unsafe::getObjectAcquire (7 bytes)
                                      @ 3   jdk.internal.misc.Unsafe::getObjectVolatile (0 bytes)   intrinsic
                                  @ 73   java.lang.Object::equals (11 bytes)   no static binding
                                  @ 93   java.util.concurrent.ConcurrentHashMap$Node::find (52 bytes)   no static binding
                                  @ 149   java.lang.Object::equals (11 bytes)   no static binding
        730   32       3       java.lang.String::charAt (25 bytes)   made not entrant
                                  @ 1   java.lang.String::isLatin1 (19 bytes)   inline (hot)
                                  @ 12   java.lang.StringLatin1::charAt (28 bytes)   inline (hot)
                                  @ 21   java.lang.StringUTF16::charAt (11 bytes)   inline (hot)
                                    @ 2   java.lang.StringUTF16::checkIndex (9 bytes)   inline (hot)
                                      @ 2   java.lang.StringUTF16::length (5 bytes)   inline (hot)
                                      @ 5   java.lang.String::checkIndex (46 bytes)   inline (hot)
                                    @ 7   java.lang.StringUTF16::getChar (60 bytes)   (intrinsic)
        731  194       3       java.lang.String::getBytes (44 bytes)
                                  @ 1   java.lang.String::coder (15 bytes)
                                  @ 22   java.lang.System::arraycopy (0 bytes)   intrinsic
                                  @ 40   java.lang.StringLatin1::inflate (10 bytes)
                                    @ 6   java.lang.StringUTF16::inflate (42 bytes)   callee is too large
        732  198       3       java.lang.StringBuilder::<init> (7 bytes)
                                  @ 3   java.lang.AbstractStringBuilder::<init> (39 bytes)   callee is too large
        732  195       3       java.lang.AbstractStringBuilder::<init> (39 bytes)
                                  @ 1   java.lang.Object::<init> (1 bytes)
        733  201       3       java.lang.Integer::stringSize (47 bytes)
        733  202       3       java.lang.Integer::getChars (131 bytes)
        734  206       3       java.lang.Integer::hashCode (2 bytes)
        734  203       3       java.lang.StringBuilder::append (8 bytes)
        735  207       4       java.util.HashMap::put (13 bytes)
                                  @ 2   java.lang.AbstractStringBuilder::append (55 bytes)   callee is too large
        735  204       3       java.lang.AbstractStringBuilder::append (55 bytes)
                                  @ 7   java.lang.Integer::stringSize (47 bytes)   callee is too large
                                  @ 14   java.lang.AbstractStringBuilder::ensureCapacityInternal (39 bytes)   callee is too large
                                  @ 18   java.lang.AbstractStringBuilder::isLatin1 (19 bytes)
                                  @ 30   java.lang.Integer::getChars (131 bytes)   callee is too large
                                  @ 44   java.lang.StringUTF16::getChars (37 bytes)   callee is too large
        736  208       1       java.lang.Integer::hashCode (2 bytes)
        736  206       3       java.lang.Integer::hashCode (2 bytes)   made not entrant
        736  205       3       java.lang.Integer::hashCode (8 bytes)
                                  @ 4   java.lang.Integer::hashCode (2 bytes)
        737  200       3       java.lang.Integer::valueOf (32 bytes)
                                  @ 28   java.lang.Integer::<init> (10 bytes)
                                    @ 1   java.lang.Number::<init> (5 bytes)
                                      @ 1   java.lang.Object::<init> (1 bytes)
        737  209       4       java.lang.AbstractStringBuilder::ensureCapacityInternal (39 bytes)
        738  196       3       java.lang.StringBuilder::toString (35 bytes)
                                  @ 1   java.lang.AbstractStringBuilder::isLatin1 (19 bytes)
                                  @ 16   java.lang.StringLatin1::newString (17 bytes)
                                    @ 9   java.util.Arrays::copyOfRange (63 bytes)   callee is too large
                                    @ 13   java.lang.String::<init> (15 bytes)
                                      @ 1   java.lang.Object::<init> (1 bytes)
                                  @ 31   java.lang.StringUTF16::newString (50 bytes)   callee is too large
        746  197       2       java.lang.Number::<init> (5 bytes)
                                  @ 1   java.lang.Object::<init> (1 bytes)
        746  199       2       java.lang.Integer::<init> (10 bytes)
                                  @ 1   java.lang.Number::<init> (5 bytes)
                                    @ 1   java.lang.Object::<init> (1 bytes)
        747  131       3       java.lang.AbstractStringBuilder::ensureCapacityInternal (39 bytes)   made not entrant
                                  @ 24   java.lang.AbstractStringBuilder::newCapacity (55 bytes)   too big
                                  @ 32   java.util.Arrays::copyOf (19 bytes)   inline (hot)
                                    @ 11   java.lang.Math::min (11 bytes)   (intrinsic)
                                    @ 14   java.lang.System::arraycopy (0 bytes)   (intrinsic)
        747  210       4       java.util.HashMap::putVal (300 bytes)
        793   45       3       java.util.HashMap::put (13 bytes)   made not entrant
                                  @ 2   java.util.HashMap::hash (20 bytes)   inline (hot)
                                    @ 9   java.lang.Object::hashCode (0 bytes)   (intrinsic, virtual)
                                  @ 9   java.util.HashMap::putVal (300 bytes)   inline (hot)
                                    @ 20   java.util.HashMap::resize (356 bytes)   hot method too big
                                    @ 56   java.util.HashMap::newNode (13 bytes)   inline (hot)
                                     \-> TypeProfile (8501/8592 counts) = java/util/HashMap
                                      @ 9   java.util.HashMap$Node::<init> (26 bytes)   inline (hot)
                                        @ 1   java.lang.Object::<init> (1 bytes)   inline (hot)
                                    @ 91   java.lang.Object::equals (11 bytes)   virtual call
                                    @ 203   java.lang.Object::equals (11 bytes)   virtual call
                                    @ 152   java.util.HashMap::newNode (13 bytes)   inline (hot)
                                     \-> TypeProfile (3970/3974 counts) = java/util/HashMap
                                      @ 9   java.util.HashMap$Node::<init> (26 bytes)   inline (hot)
                                        @ 1   java.lang.Object::<init> (1 bytes)   inline (hot)
                                    @ 253   java.util.HashMap::afterNodeAccess (1 bytes)   inline (hot)
                                     \-> TypeProfile (21/21 counts) = java/util/HashMap
                                    @ 288   java.util.HashMap::resize (356 bytes)   hot method too big
                                    @ 295   java.util.HashMap::afterNodeInsertion (1 bytes)   inline (hot)
                                     \-> TypeProfile (12471/12566 counts) = java/util/HashMap
        794  211       4       java.lang.Integer::stringSize (47 bytes)
        797  201       3       java.lang.Integer::stringSize (47 bytes)   made not entrant
        797  212       4       java.lang.Integer::getChars (131 bytes)
        800  124       3       java.util.HashMap::putVal (300 bytes)   made not entrant
                                  @ 20   java.util.HashMap::resize (356 bytes)   hot method too big
                                  @ 56   java.util.HashMap::newNode (13 bytes)   inline (hot)
                                   \-> TypeProfile (13746/13837 counts) = java/util/HashMap
                                    @ 9   java.util.HashMap$Node::<init> (26 bytes)   inline (hot)
                                      @ 1   java.lang.Object::<init> (1 bytes)   inline (hot)
                                  @ 91   java.lang.Object::equals (11 bytes)   virtual call
                                  @ 203   java.lang.Object::equals (11 bytes)   virtual call
                                  @ 152   java.util.HashMap::newNode (13 bytes)   inline (hot)
                                   \-> TypeProfile (3970/3974 counts) = java/util/HashMap
                                    @ 9   java.util.HashMap$Node::<init> (26 bytes)   inline (hot)
                                      @ 1   java.lang.Object::<init> (1 bytes)   inline (hot)
                                  @ 253   java.util.HashMap::afterNodeAccess (1 bytes)   inline (hot)
                                   \-> TypeProfile (21/21 counts) = java/util/HashMap
                                  @ 288   java.util.HashMap::resize (356 bytes)   hot method too big
                                  @ 295   java.util.HashMap::afterNodeInsertion (1 bytes)   inline (hot)
                                   \-> TypeProfile (17716/17811 counts) = java/util/HashMap
        800  223       4       java.lang.AbstractStringBuilder::append (55 bytes)
        812  202       3       java.lang.Integer::getChars (131 bytes)   made not entrant
        812  215       4       java.lang.AbstractStringBuilder::append (45 bytes)
        830  182       3       java.lang.AbstractStringBuilder::append (45 bytes)   made not entrant
                                  @ 10   java.lang.String::length (11 bytes)   inline (hot)
                                    @ 6   java.lang.String::coder (15 bytes)   inline (hot)
                                  @ 21   java.lang.AbstractStringBuilder::ensureCapacityInternal (39 bytes)   inline (hot)
                                    @ 24   java.lang.AbstractStringBuilder::newCapacity (55 bytes)   too big
                                    @ 32   java.util.Arrays::copyOf (19 bytes)   inline (hot)
                                      @ 11   java.lang.Math::min (11 bytes)   (intrinsic)
                                      @ 14   java.lang.System::arraycopy (0 bytes)   (intrinsic)
                                  @ 30   java.lang.AbstractStringBuilder::putStringAt (29 bytes)   inline (hot)
                                    @ 1   java.lang.AbstractStringBuilder::getCoder (15 bytes)   inline (hot)
                                    @ 5   java.lang.String::coder (15 bytes)   inline (hot)
                                    @ 12   java.lang.AbstractStringBuilder::inflate (42 bytes)   too big
                                    @ 25   java.lang.String::getBytes (44 bytes)   inline (hot)
                                      @ 1   java.lang.String::coder (15 bytes)   inline (hot)
                                      @ 22   java.lang.System::arraycopy (0 bytes)   (intrinsic)
                                      @ 40   java.lang.StringLatin1::inflate (10 bytes)   (intrinsic)
        830  216       4       java.lang.AbstractStringBuilder::<init> (39 bytes)
        834  195       3       java.lang.AbstractStringBuilder::<init> (39 bytes)   made not entrant
                                  @ 1   java.lang.Object::<init> (1 bytes)   inline (hot)
        834  220       4       java.lang.String::getBytes (44 bytes)
        838  194       3       java.lang.String::getBytes (44 bytes)   made not entrant
                                  @ 1   java.lang.String::coder (15 bytes)   inline (hot)
                                  @ 22   java.lang.System::arraycopy (0 bytes)   (intrinsic)
                                  @ 40   java.lang.StringLatin1::inflate (10 bytes)   (intrinsic)
        838  213       4       java.util.Arrays::copyOfRange (63 bytes)
        844  127       3       java.util.Arrays::copyOfRange (63 bytes)   made not entrant
                                  @ 54   java.lang.Math::min (11 bytes)   (intrinsic)
                                  @ 57   java.lang.System::arraycopy (0 bytes)   (intrinsic)
        844  214       4       java.lang.StringBuilder::append (8 bytes)
        844  204       3       java.lang.AbstractStringBuilder::append (55 bytes)   made not entrant
                                  @ 7   java.lang.Integer::stringSize (47 bytes)   inline (hot)
                                  @ 14   java.lang.AbstractStringBuilder::ensureCapacityInternal (39 bytes)   inline (hot)
                                    @ 24   java.lang.AbstractStringBuilder::newCapacity (55 bytes)   too big
                                    @ 32   java.util.Arrays::copyOf (19 bytes)   inline (hot)
                                      @ 11   java.lang.Math::min (11 bytes)   (intrinsic)
                                      @ 14   java.lang.System::arraycopy (0 bytes)   (intrinsic)
                                  @ 18   java.lang.AbstractStringBuilder::isLatin1 (19 bytes)   inline (hot)
                                  @ 30   java.lang.Integer::getChars (131 bytes)   inline (hot)
        844  217       4       java.lang.StringBuilder::toString (35 bytes)
        855  196       3       java.lang.StringBuilder::toString (35 bytes)   made not entrant
                                  @ 1   java.lang.AbstractStringBuilder::isLatin1 (19 bytes)   inline (hot)
                                  @ 16   java.lang.StringLatin1::newString (17 bytes)   inline (hot)
                                    @ 9   java.util.Arrays::copyOfRange (63 bytes)   inline (hot)
                                      @ 54   java.lang.Math::min (11 bytes)   (intrinsic)
                                      @ 57   java.lang.System::arraycopy (0 bytes)   (intrinsic)
                                    @ 13   java.lang.String::<init> (15 bytes)   inline (hot)
                                      @ 1   java.lang.Object::<init> (1 bytes)   inline (hot)
                                  @ 31   java.lang.StringUTF16::newString (50 bytes)   too big
        855  219       4       java.lang.StringBuilder::<init> (7 bytes)
        859  198       3       java.lang.StringBuilder::<init> (7 bytes)   made not entrant
                                  @ 3   java.lang.AbstractStringBuilder::<init> (39 bytes)   inline (hot)
                                    @ 1   java.lang.Object::<init> (1 bytes)   inline (hot)
        859  221       4       java.lang.Integer::valueOf (32 bytes)
        862  200       3       java.lang.Integer::valueOf (32 bytes)   made not entrant
                                  @ 28   java.lang.Integer::<init> (10 bytes)   inline (hot)
                                    @ 1   java.lang.Number::<init> (5 bytes)   inline (hot)
                                      @ 1   java.lang.Object::<init> (1 bytes)   inline (hot)
        862  222       4       java.lang.StringBuilder::append (8 bytes)
        863  203       3       java.lang.StringBuilder::append (8 bytes)   made not entrant
                                  @ 2   java.lang.AbstractStringBuilder::append (55 bytes)   already compiled into a big method
        863  218       4       java.lang.Integer::hashCode (8 bytes)
        863  181       3       java.lang.StringBuilder::append (8 bytes)   made not entrant
                                  @ 2   java.lang.AbstractStringBuilder::append (45 bytes)   inline (hot)
                                    @ 10   java.lang.String::length (11 bytes)   inline (hot)
                                      @ 6   java.lang.String::coder (15 bytes)   inline (hot)
                                    @ 21   java.lang.AbstractStringBuilder::ensureCapacityInternal (39 bytes)   inline (hot)
                                      @ 24   java.lang.AbstractStringBuilder::newCapacity (55 bytes)   too big
                                      @ 32   java.util.Arrays::copyOf (19 bytes)   inline (hot)
                                        @ 11   java.lang.Math::min (11 bytes)   (intrinsic)
                                        @ 14   java.lang.System::arraycopy (0 bytes)   (intrinsic)
                                    @ 30   java.lang.AbstractStringBuilder::putStringAt (29 bytes)   inline (hot)
                                      @ 1   java.lang.AbstractStringBuilder::getCoder (15 bytes)   inline (hot)
                                      @ 5   java.lang.String::coder (15 bytes)   inline (hot)
                                      @ 12   java.lang.AbstractStringBuilder::inflate (42 bytes)   too big
                                      @ 25   java.lang.String::getBytes (44 bytes)   inline (hot)
                                        @ 1   java.lang.String::coder (15 bytes)   inline (hot)
                                        @ 22   java.lang.System::arraycopy (0 bytes)   (intrinsic)
                                        @ 40   java.lang.StringLatin1::inflate (10 bytes)   (intrinsic)
        863  205       3       java.lang.Integer::hashCode (8 bytes)   made not entrant
                                  @ 4   java.lang.Integer::hashCode (2 bytes)   inline (hot)
        881  224 %     3       Main::main @ 10 (53 bytes)
                                  @ 4   java.util.HashMap::<init> (11 bytes)
                                    @ 1   java.util.AbstractMap::<init> (5 bytes)
                                      @ 1   java.lang.Object::<init> (1 bytes)
                                  @ 18   java.lang.Integer::valueOf (32 bytes)
                                    @ 28   java.lang.Integer::<init> (10 bytes)
                                      @ 1   java.lang.Number::<init> (5 bytes)
                                        @ 1   java.lang.Object::<init> (1 bytes)
                                  @ 25   java.lang.StringBuilder::<init> (7 bytes)
                                    @ 3   java.lang.AbstractStringBuilder::<init> (39 bytes)   callee is too large
                                  @ 30   java.lang.StringBuilder::append (8 bytes)
                                    @ 2   java.lang.AbstractStringBuilder::append (45 bytes)   callee is too large
                                  @ 34   java.lang.StringBuilder::append (8 bytes)
                                    @ 2   java.lang.AbstractStringBuilder::append (55 bytes)   callee is too large
                                  @ 37   java.lang.StringBuilder::toString (35 bytes)
                                    @ 1   java.lang.AbstractStringBuilder::isLatin1 (19 bytes)
                                    @ 16   java.lang.StringLatin1::newString (17 bytes)
                                      @ 9   java.util.Arrays::copyOfRange (63 bytes)   callee is too large
                                      @ 13   java.lang.String::<init> (15 bytes)
                                        @ 1   java.lang.Object::<init> (1 bytes)
                                    @ 31   java.lang.StringUTF16::newString (50 bytes)   callee is too large
                                  @ 40   java.util.Map::put (0 bytes)   no static binding
        885  225       3       Main::main (53 bytes)
                                  @ 4   java.util.HashMap::<init> (11 bytes)
                                    @ 1   java.util.AbstractMap::<init> (5 bytes)
                                      @ 1   java.lang.Object::<init> (1 bytes)
                                  @ 18   java.lang.Integer::valueOf (32 bytes)
                                    @ 28   java.lang.Integer::<init> (10 bytes)
                                      @ 1   java.lang.Number::<init> (5 bytes)
                                        @ 1   java.lang.Object::<init> (1 bytes)
                                  @ 25   java.lang.StringBuilder::<init> (7 bytes)
                                    @ 3   java.lang.AbstractStringBuilder::<init> (39 bytes)   callee is too large
                                  @ 30   java.lang.StringBuilder::append (8 bytes)
                                    @ 2   java.lang.AbstractStringBuilder::append (45 bytes)   callee is too large
                                  @ 34   java.lang.StringBuilder::append (8 bytes)
                                    @ 2   java.lang.AbstractStringBuilder::append (55 bytes)   callee is too large
                                  @ 37   java.lang.StringBuilder::toString (35 bytes)
                                    @ 1   java.lang.AbstractStringBuilder::isLatin1 (19 bytes)
                                    @ 16   java.lang.StringLatin1::newString (17 bytes)
                                      @ 9   java.util.Arrays::copyOfRange (63 bytes)   callee is too large
                                      @ 13   java.lang.String::<init> (15 bytes)
                                        @ 1   java.lang.Object::<init> (1 bytes)
                                    @ 31   java.lang.StringUTF16::newString (50 bytes)   callee is too large
                                  @ 40   java.util.HashMap::put (13 bytes)
                                    @ 2   java.util.HashMap::hash (20 bytes)
                                      @ 9   java.lang.Object::hashCode (0 bytes)   no static binding
                                    @ 9   java.util.HashMap::putVal (300 bytes)   callee is too large
        933  226 %     4       Main::main @ 10 (53 bytes)
        964  224 %     3       Main::main @ 10 (53 bytes)   made not entrant
                                  @ 18   java.lang.Integer::valueOf (32 bytes)   inline (hot)
                                    @ 28   java.lang.Integer::<init> (10 bytes)   inline (hot)
                                      @ 1   java.lang.Number::<init> (5 bytes)   inline (hot)
                                        @ 1   java.lang.Object::<init> (1 bytes)   inline (hot)
                                  @ 25   java.lang.StringBuilder::<init> (7 bytes)   inline (hot)
                                  @ 30   java.lang.StringBuilder::append (8 bytes)   inline (hot)
                                  @ 34   java.lang.StringBuilder::append (8 bytes)   inline (hot)
                                  @ 37   java.lang.StringBuilder::toString (35 bytes)   inline (hot)
                                  @ 40   java.util.HashMap::put (13 bytes)   already compiled into a big method
       1569  226 %     4       Main::main @ 10 (53 bytes)   made not entrant
### GC
    