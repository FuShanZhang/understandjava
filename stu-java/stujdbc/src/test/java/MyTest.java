import com.zfs.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {

    @Test
    public void Test() throws IOException {
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        Student student = sqlSession.selectOne("test.selectOneById",1);
        System.out.println(student);

        sqlSession.close();
        inputStream.close();
    }

    @Test
    public void testFindStudentByName() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<Student> student = sqlSession.selectList("test.findStudentByName","%王");
        System.out.println(student);
        sqlSession.close();
        in.close();
    }


    @Test
    public void testInsert() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession  = sqlSessionFactory.openSession();

        Student student = new Student("小乔","123");
        int i = sqlSession.insert("test.insertStudent",student);

        sqlSession.commit();
        System.out.println("插入ID" + student.getId());

        sqlSession.close();
        in.close();
    }

    @Test
    public void testUpdate() throws IOException {

        InputStream in  = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession  = sqlSessionFactory.openSession();

        Student student = new Student(9,"大乔","123");
        sqlSession.update("test.updateStudentById",student);

        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

    @Test
    public void testDeleteById() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSessionFactory  = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        sqlSession.delete("deleteStudentById",2);

        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
}
