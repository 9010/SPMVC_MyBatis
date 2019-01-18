package cn.com.self.dao.impl;

import cn.com.self.dao.TestDao;
import cn.com.self.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestDaoImpl implements TestDao {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession = null;

    private SqlSession getSqlSession(){
        if(sqlSession == null){
            sqlSession = sqlSessionFactory.openSession();
        }
        return sqlSession;
    }

    @Override
    public List<User> findUserByName(User user) {
        List<User> uList = getSqlSession().selectList("test.findUserByName",
                "%"+user.getName()+"%");
        return uList;
    }
}
