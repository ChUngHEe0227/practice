package StringAndArray;

public class StringCompressionExample {

    public String CompareString(String Original,String Compress_version){
            if (Original.length()<Compress_version.length())
                return Original;
            else
                return Compress_version;
        }

        public String  StringCompression(String StringSource){
            StringBuilder compress_String = new StringBuilder();
            int duplicate = 0;
            for(int i=0;i<StringSource.length();i++){
                duplicate++;
                if (i+1>=StringSource.length() || StringSource.charAt(i)!=StringSource.charAt(i+1))
                {
                    compress_String.append(StringSource.charAt(i));
                    compress_String.append(duplicate);
                    duplicate=0;
                }
            }
            return CompareString(StringSource,compress_String.toString());
        }

}
