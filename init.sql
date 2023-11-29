USE company;

-- Create a sample table
CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    position VARCHAR(255),
    salary DECIMAL(10, 2)
);

-- Insert some sample data
INSERT INTO employees (name, position, salary) VALUES
    ('John Doe', 'Software Engineer', 75000.00),
    ('Jane Smith', 'Product Manager', 90000.00);